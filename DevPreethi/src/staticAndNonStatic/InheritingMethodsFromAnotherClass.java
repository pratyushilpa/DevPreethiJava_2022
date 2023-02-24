package staticAndNonStatic;

public class InheritingMethodsFromAnotherClass extends UnderstandingStaticAndNonStatic{
	static UnderstandingStaticAndNonStatic us = new UnderstandingStaticAndNonStatic();
	
	/*
	 * @Override public static void test1() { System.out.println("inside test1"); }
	 */
	
	
	  @Override 
	  public void test2() { int i =10;
	  System.out.println("inside test2"); if(i>9) {
	 System.out.println("I is greater than 9"); } }
	 
	public static void main(String[] args) {
		//test1();
		//us.test2();
		UnderstandingStaticAndNonStatic us1;
		us1 = new InheritingMethodsFromAnotherClass();
		us1.test2();
		
		System.out.println("------------------");
		us = new UnderstandingStaticAndNonStatic();
		us.test2();
	}

}
