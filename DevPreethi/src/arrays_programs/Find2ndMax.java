package arrays_programs;

import java.util.Arrays;

public class Find2ndMax {
	
	static int [] arr ={65,85,77,90,10,90}; 
	static int max =0 ;
	public static int getMax(int[] input) {
		for(int i =0 ; i<input.length;i++) {
			if(max>input[i]) {
				max = max;
			}
			else {
				max = input[i];
				//input[i] = 0;
				//continue;
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int [] tempArr= new int[2];
		//System.out.println(getMax(arr));
		tempArr[0] =getMax(arr); // max
		tempArr[1] = getMax(arr); // 2nd max
		//System.out.println(tempArr[1]);
		
		Arrays.sort(arr); // int [] arr = {10,65,77,85,90,90} 
		int secondMax=0;
		for(int i = arr.length-1;i>=0;i--) {
			secondMax = arr[i];
			if(secondMax != arr[i-1]) {
				System.out.println(arr[i-1]);
				break;
			}
		}
		//System.out.println(secondMax);
	}

}
