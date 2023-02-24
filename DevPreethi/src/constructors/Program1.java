package constructors;

public class Program1 {
	int a ;
	String s;
	public Program1() {
		a =10;
		s= "Hello";
	}
	public static void method1() {
		System.out.println("inside method1");
	}
	public static void method2(Program p ) {
		System.out.println("inside method2");
		p.method11();
	}
	public static void main(String[] args) {
		// new Program1().method1();
		//Program1 p = new Program1();
		//System.out.println(p.a);
		//System.out.println(p.s);
		//System.out.println(new Program1().a);
		method2(new Program());
	}

}
