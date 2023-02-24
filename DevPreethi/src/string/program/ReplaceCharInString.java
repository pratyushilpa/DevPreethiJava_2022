package string.program;

public class ReplaceCharInString {
	// method to compute the char replacement in the given String
	// it is having two parameters String , char
	// and the return type is String
	public static String censorLetter(String str, char c) {
		String newStr = new String();
		// convert the String in to char Array 
		// the return type of toCharArray() is a char[] 
		 char[] chars =str.toCharArray();
		 
		 // Now iterating over the char[] using for loop
		 for(int i =0; i<chars.length;i++) {
			 // Now , we have to write the condition which will evalute if the char is available in the char[] or not
			 // if available then replace it with *
			 if(chars[i]==c) {
				 newStr +='*';
			 }
			 else {
				 newStr +=chars[i];
			 }
		 }
		return newStr;
	}
	public static void main(String[] args) {
		String input = "computer science";
		String output = ReplaceCharInString.censorLetter(input, 'e');
			System.out.println("String after the char replacement:: "+output);
	}

}
