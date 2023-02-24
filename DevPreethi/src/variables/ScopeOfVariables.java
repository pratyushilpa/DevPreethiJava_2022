package variables;

public class ScopeOfVariables {
	static int a;
	static String s; 

	// local variables type -1
	public static void method() {
		int a = 100;
		String s ="Hello"; 
	}
	// local variables type -2
	public static void method(int a , String s) {
		System.out.println(a);
		System.out.println(s);
		System.out.println("---------------------");
		a = 100;
		s ="Hello"; 
		System.out.println(a);
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(ScopeOfVariables.a);
		ScopeOfVariables.method(a, s);
	}

}
