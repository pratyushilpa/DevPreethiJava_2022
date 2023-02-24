package staticAndNonStatic;

public class UseOfStaticBlock {
	static {
		System.out.println("Inside static block");
		int num =100;
		String var ="India";
		System.out.println("Inside static block" + num);
		System.out.println("Inside static block" + var);
	}
	public static void test() {
		System.out.println();
	}
	public static void main(String[] args) {
		
	}

}
