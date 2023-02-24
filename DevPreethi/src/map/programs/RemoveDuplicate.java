package map.programs;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {
	
	public static ArrayList<Integer> removeDuplicate(int [] a){
		ArrayList<Integer> arrList = new ArrayList<>();
		HashMap<Integer,Boolean> hm = new HashMap<>();
		for(int i =0 ;i<a.length;i++) {
			if(hm.containsKey(a[i])) {
				continue;
			}
			arrList.add(a[i]);
			hm.put(a[i], true);
		}
		return arrList;
	}
	public static void main(String[] args) {
		int [] a ={1,2,3,4,1,2,2,4,4,5,9,5,10};
		ArrayList<Integer> output = removeDuplicate(a);
		System.out.print("[ ");
		for(int x:output) {
			System.out.print(x);
			System.out.print(",");
			System.out.print(" ");
		}
		System.out.print("]");
	}

}
