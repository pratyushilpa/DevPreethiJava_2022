package constructors;

public class ConstructorChaining {
		int a ;
		String s;
		public ConstructorChaining() {
			a =10;
			s= "Hello";
			System.out.println(a);
			System.out.println(s);
		}
		public ConstructorChaining(int a , String s) {
			this();
			a =100;
			s= "Hello From Param constructor";
			System.out.println(a);
			System.out.println(s);
		}
		
		public ConstructorChaining(int a ) {
			this(20,"India");
			a =1000;
			System.out.println(a);
		}
		public static void method11() {
			System.out.println("From Program");
		}
		public static void main(String args[]) {
			//new ConstructorChaining();
			//new ConstructorChaining(20, "India");
			//System.out.println(new ConstructorChaining().a);
			//System.out.println(new ConstructorChaining().s);
			
			new ConstructorChaining(1);
		}
	}



