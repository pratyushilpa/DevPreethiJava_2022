package while_loop;
import java.util.Scanner;

public class PrintNumbers {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int i = 1;
	while(i <=N) {
		System.out.println("Going inside the loop");
		System.out.println("I values is : " +i);
		i = i+1;
	}
System.out.println("Coming out of the loop");
	}

}
