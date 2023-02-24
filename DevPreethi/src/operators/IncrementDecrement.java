package operators;

public class IncrementDecrement {

	public static void main(String[] args) {
		int i = 10 ;
		System.out.println(i++); // o/p ? 10  , i =11
		i++ ; //  i =12
		System.out.println("I is : "+i); // o/p ? 12
		++i ; // 
		System.out.println("I is : "+i); // o/p ? 13
		//------------------------------------------
		//Decrement operator : --
		int j = 10 ;
		j-- ; // 
		System.out.println("J is : "+j); // o/p ? 9
		--j ; // 
		System.out.println("J is : "+j); // o/p ? 8

	}

}
