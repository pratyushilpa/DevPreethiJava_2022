package inner_class;

public class Outer_Class {
	static int outer_x = 100;
	public static void test() {
		//Inner in = new Inner();
		Inner.display();
	}
	class Inner{
		
		public static void display() {
			System.out.println("The Outer X value is : " +outer_x );
		}
		public static void showY() {
			int y =200;
			System.out.println("The Outer X value is : " +y );
		}
	}
	public static void main(String[] args) {
		Outer_Class.test();
		Outer_Class.Inner.showY();
	}
}
