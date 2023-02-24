package string.program;

public class ReverseEachWord {

public static void main(String[] args) {
		String str = "JAVA HELLO PReethi";
		
		String[] strArray = str.split(" "); // it has only 3 index // split method works on regx [- , ]
		for (int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
			for(int j=0;j<strArray.length;j++) { // holding 3 words
				// 1st iteration : JAVA
				// get char Array 
				char[] chars=strArray[j].toCharArray();  // ['J','A','V','A'];
				// Now , iterate over the char Array 
			
				for(int k =chars.length-1;k>=0;k--) {  // chars.length-1 = 3 [index will start from 3 to zero]
					System.out.print(chars[k]);
			}
				System.out.println();
		}
}
}

