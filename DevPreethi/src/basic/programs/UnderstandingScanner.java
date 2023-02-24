package basic.programs;
import java.util.Scanner;
public class UnderstandingScanner {
	
	static int a  ;
	static int b  ;
	static int c  ;
	static int max;
	public static int findLargest() {
		max = a;
		if (max >b && max > c) {
			return max;
		}
		 if (max <b) {
			max = b;
		}
		if (max < c)
		{
			max = c;
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 numbers");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		System.out.println("a is = " +a);
		System.out.println("b is = " +b);
		System.out.println("c is = " +c);
		 int largest = findLargest();
		  System.out.println(largest);
	}

}
