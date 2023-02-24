
public class Understanding_Constant {
	final int NUMBER = 10;
	final String VARIABLE = "Hello";
	static final int NUMBER2 = 100;
	
public final void test() {
	System.out.println("Inside Test");
}
public static final void test(int a) {
	System.out.println("Inside Test : "+a);
}

class Subclass extends Understanding_Constant{
	//@override
	//public final void test() {
		//System.out.println("Inside Test");
//	}
	public static void method() {
		Understanding_Constant.test(NUMBER2);
	}
}
	public static void main(String[] args) {
		//NUMBER2 = 1000; // We can't modify or reassign
	}

}
