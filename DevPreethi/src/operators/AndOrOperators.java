package operators;

import ifElse.UnderstandingIfElse;

public class AndOrOperators {
	
	AndOrOperators aa;
	//UnderstandingIfElse ue = new UnderstandingIfElse() ;
	
	static boolean a = false ;
	static boolean b = true;
	
	static boolean c = false ;
	static boolean d = false;
	
	static boolean e = true ;
	static boolean f = true;
	public void method() {
		//ue.method2();
	}
	public static void main(String[] args) {
		if(a || b) {
			System.out.println("Hello ");
		}
		// -------------------------------------------------------
		if(c || d) {
			System.out.println("Hello Again");
		}
		
		// ------------------------------------------------------
		
		if(a && b) {
			System.out.println("Don't Execute ");
		}
		
		if(c && d) {
			System.out.println("Don't Execute ");
		}
		
		if(e && f) {
			System.out.println("Execute ");
		}

	}

}
