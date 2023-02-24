package map.programs;

import java.util.HashMap;

public class CountOccurence {
	
	public static HashMap<Integer,Integer> countOccurence(int [] arr){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i =0 ;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				int value =hm.get(arr[i]);
				hm.put(arr[i], value+1);
			}
			else {
				hm.put(arr[i], 1);
			}
		}
		return hm;
	}
	public static void main(String[] args) {
		int [] arr ={1,2,3,4,1,2,2,4,4};
		HashMap<Integer,Integer> output =countOccurence(arr);
		System.out.println(output);
	}

}
