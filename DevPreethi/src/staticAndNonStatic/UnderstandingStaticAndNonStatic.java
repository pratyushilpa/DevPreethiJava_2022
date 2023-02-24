package staticAndNonStatic;

public class UnderstandingStaticAndNonStatic {
	static int a =10;
	public static void test1() {
		System.out.println("inside test1");
	}
	// method overloading
	public static void test1(int a) {
		System.out.println("inside test1 : " + a);
	}
	public  void test2() {
		System.out.println("inside test2");
	}	
	public static void main(String[] args) {
		test1();
		test1(100);
		UnderstandingStaticAndNonStatic us = new UnderstandingStaticAndNonStatic();
		 us .test2();
	}

}
