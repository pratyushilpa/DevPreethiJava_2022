package oops;

public class MethodOverloading {
	
	MethodOverloading mo1 = new MethodOverloading();
public void test() {
	System.out.println("Inside test method Zero Argument");
}
public void test(int a , int b) {
	System.out.println("Inside test method with two Argument");
}
public int test(int a) {
	System.out.println("Inside test method with One Integer Argument");
	return 0;
}
public double test(double d) {
	System.out.println("Inside test method with One double Argument");
	return 0.0;
}
public MethodOverloading test(MethodOverloading mo) {
	System.out.println("Inside test method with One Object reference Argument");
	return mo1; // null
	//return new MethodOverloading();
}
	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		MethodOverloading mo1 = new MethodOverloading();
		mo.test();
		mo.test(10.0);
		mo.test(100);
		mo.test(mo1);
		mo.test(10, 20);
	}

}
