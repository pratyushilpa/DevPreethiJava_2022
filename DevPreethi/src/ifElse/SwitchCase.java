package ifElse;
public class SwitchCase {
	static int i =10;
	public static void method1(char c){
		switch(c){
		case 'A' :
		           System.out.println("Hello");
		           if(i *10 ==100) {
		        	System.out.println("Print i square is :: "+ i*i);   
		           }
		           break;
		case 'B' :
		           System.out.println("Hello From B");
		           break;
		default :
		System.out.print("Reached end of the switch case");
		}
		}
	public static void main(String[] args) {
		SwitchCase.method1('A');
	}

}
