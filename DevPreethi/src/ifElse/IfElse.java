package ifElse;

public class IfElse {
	static int a =0;
	static int b =0;
	public static int sum() {
		int sum =0;
		if(a>0 || b>0) {
			sum = a+b;
		}
		else {
			return -1;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum());
		int X= sum(); 
		
		System.out.println(X);
		
	}

}
