package arrays_programs;
public class Understanding_Array {
	
	public static void printArray(int [] input) {
		int size = input.length; // 10 
		System.out.println(size);
		/*
		 * for(int i =0 ; i<size;i++) { System.out.println(input[i]); }
		 */
		// for-each loop
		// data-type    var : objects 
		// sysout(var);
		for(int x : input ) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		//int [] arr = new int[10];
		int [] arr = {10,20,30,40,50,70,80,100,90,60};
		
		printArray(arr);
	}

}
