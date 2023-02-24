package string.program;

public class StringMethods2 {

	public static void main(String[] args) {
		String str = new String("Test");
		
		String str1 ="Test";
		String str2 ="test";
		String str3 = "Test Again";
		
		str.charAt(0); // T
		//str.compareTo(str1) ; // 0
		//System.out.println(str.compareToIgnoreCase(str2)); // 
		System.out.println(str.concat(str2)); // Testtest
		str.contains("es") ; // true
		str.endsWith("st"); // true
		str.equalsIgnoreCase(str2) ; // true
		str.isEmpty();// false
		str.isBlank();//
		str.length();//
		str.startsWith("Tes");
		str.toCharArray(); // char[] chars // T e s t
		str3.split(" "); // String[] str // str[0]  & str[1];
		

	}

}
