import java.util.Scanner;

public class Understanding_Boolean {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Boolean value");
		boolean b = true;
		boolean userInput = input.nextBoolean();
		if(userInput==b) {
			System.out.println("The value is true : " +userInput );
		}
		else {
			System.out.println("The value is false: "+userInput);
		}
		

	}

}
