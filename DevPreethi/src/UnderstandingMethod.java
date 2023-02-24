
public class UnderstandingMethod {
	int a ;
	String s;
	public static void method1() {
		System.out.println("Inside method1");
	}
	
	public  void method2() {
		System.out.println("Inside non-static method2");
	}
	
public UnderstandingMethod() {
	a = 10 ;
	 s = "India";
}
	public UnderstandingMethod(int a , String s) {
	this.a =a;
	this.s =s;
	}
private UnderstandingMethod(int a) {
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		UnderstandingMethod um = new UnderstandingMethod();
		um.method2();
		System.out.println(um.a);
		System.out.println(um.s);
		
		UnderstandingMethod um2 = new UnderstandingMethod(20,"World");
		System.out.println(um2.a);
		System.out.println(um2.s);
		
		
		UnderstandingMethod um3 = new UnderstandingMethod(10);
	}

}
