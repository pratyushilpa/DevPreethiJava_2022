package string.program;

public class StringEquals {
	
	public static void main(String[] args) {
	 String s1 = "Hello";
	 String s2 = "Hello1";
	 String s3 = new String("Hello");
	 
	 if(s1==s2) {
		 System.out.println("S1 & S2 are in constant pool : " + true);
	 }
if(s1.equals(s2)) {
	System.out.println("S1 & S2 are in constant pool & The Contents of teh string are same : " + true);
}
if(s1==s3) {
	 System.out.println("S1 & S3 are not in same constant pool : " + true);
}
if(s1.equals(s3)) {
System.out.println("S1 & S3 are in not in constant pool & The Contents of the string are same : " + true);
}


	}

}
