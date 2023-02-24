package basic.programs;

public class FindLargestOf3Numbers {
	static int a = 100 ;
	static int b = 90 ;
	static int c =180 ;
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
		  int largest = findLargest();
		  System.out.println(largest);
	}

}
