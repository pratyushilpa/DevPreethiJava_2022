package string.program;

public class PrintDuplicateAndCount {

	public static void main(String[] args) {
		int count =0;
		int i =0 ;
		String [] strArray = {"Hello" , "Java","Hello", "Again","Hello"};
		for ( i =0; i<strArray.length;i++ ) {
			for (int j= i+1; j<strArray.length; j++) {
				 if(strArray[i] == strArray[j]) {
					 count++;
					 //System.out.println("count is " +count);
				 }
			}
		}
		System.out.print(strArray[i-1]+":");
		System.out.println(count);
	}
}
