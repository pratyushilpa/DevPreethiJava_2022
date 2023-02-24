package oops;

class A{
	static int i ;
	static String name;
	  public A(int i , String name) { 
		 this.i =i; 
		  this.name = name;
	 System.out.println("A - Constructor"); 
	 System.out.println("i value"+i);
	 System.out.println("Name is "+name);
	 }
	 
	public static void methodOfA() {
		System.out.println("Inside method of - A");
	}
}
class B extends A{
	public B() {
		super(10,"India");
		System.out.println("B - Constructor");
	}
	// ** If the method is static - You can't call super in that 
	public  void methodOfB() {
		System.out.println(super.i);  // 10 
		super.methodOfA(); // Inside method of - A
	}
}
class C extends B{
	public C() {
		System.out.println("C - Constructor");
	}
	public static void test() {
		System.out.println("Inside Test method of - C");
	}
}
public class UnderstandingSuper {

	public static void main(String[] args) {
		B b1 = new B();
		b1.methodOfB();
		//C c1 = new C();
		
	}

}
