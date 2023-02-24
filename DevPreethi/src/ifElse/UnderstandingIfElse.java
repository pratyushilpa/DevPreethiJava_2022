package ifElse;

public class UnderstandingIfElse {
	static int a =10;
	static int b =20;
	static boolean flag = true;
	static boolean flag1 = true;
	// when you use conditional operators the Output is boolean (T/F) 
	// wherever you want to use condition then use below conditional syntax
	// a == b  : comparison 
	// a< b   :  a is less than b
	// a>b  :  a is greater than b
	// a<=b :  a is less than  equal to b
	// a>=b :  a is greater than b
	//a !=b :  a is not equal to b
	
	public static void method1() {
		if(a == b) {
			// it is false
			// Hence it will not go inside the if block
		}
		if(b>a) {
			// it is true
						// Hence it will go inside the if block
			System.out.println("b is greater than a");
		}
		
		if(flag1 ) {
			// it is true
			// Hence it will go inside the if block
			System.out.println("True true true ture");
		}
		
		if(flag1  !=true) { // true == false
			// it is False
			// Hence it will not go inside the if block
			System.out.println("false false false false");
		}
		
		if(flag1  !=false) { // flag1 = true
			                        // !=false (true)
			// it is False
			// Hence it will not go inside the if block
			System.out.println("true1 true1 true1");
		}
	}
	public  void method2() {
		System.out.println("From If Else Method-2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
	}

}
