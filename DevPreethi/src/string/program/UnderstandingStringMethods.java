package string.program;

public class UnderstandingStringMethods {

	public static void main(String[] args) {
		String str = new String("Test"); // resides in heap memory
		String s = "Test";  // this goes and resides in string constant pool 
		String s1 ="Test"; // it won't create another string because it's already available in SCP
		// comparing the address of these two string objects
		if(str==s) {
			System.out.println("Inside if condition where two difft string ref are comapred");
		}
		if(s==s1) {
			System.out.println("Inside if condition where two string ref are comapred");
		}
		if(s.equals(str)) {
			System.out.println("True");
		}
		if(s.equals(s1)) {
			System.out.println("It is also True");
		}
		else {
			System.out.println("Two different String objects address");
		}

	}

}
