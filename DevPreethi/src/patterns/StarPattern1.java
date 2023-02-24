package patterns;

public class StarPattern1 {

	public static void main(String[] args) {
		
		/*0th - 1
		1 st  - 2
		2nd  -3 
		3rd - 4
		*/
		for(int i =0 ;i<4;i++) {
			for(int j =0 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
