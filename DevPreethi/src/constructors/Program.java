package constructors;

public class Program {
	int a ;
	String s;
	public Program() {
		//a =10;
		//s= "Hello";
	}
	public Program(int a , String s) {
		System.out.println(a);
		System.out.println(s);
		a =100;
		s= "Hello From Param constructor";
		System.out.println(a);
		System.out.println(s);
	}
	public static void method11() {
		System.out.println("From Program");
	}
	public static void main(String args[]) {
		new Program();
		System.out.println(new Program().a);
		System.out.println(new Program().s);
		new Program(20, "India");
		
	}
}
