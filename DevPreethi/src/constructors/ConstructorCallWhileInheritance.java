package constructors;
class A{
	public A() {
		System.out.println("A - Constructor");
	}
}
class B extends A{
	public B() {
		System.out.println("B - Constructor");
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
public class ConstructorCallWhileInheritance {
	public static void main(String[] args) {
		C c = new C();
		//c.test();
	}
}
