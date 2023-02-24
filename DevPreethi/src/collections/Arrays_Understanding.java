package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Arrays_Understanding {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		int[] arr = {10,20,30,20,10};
		//Collections.sort(arr);
	ArrayList<Integer> arrList = new ArrayList<>();
	arrList.add(100);
	arrList.add(200);
	arrList.add(1,100);
	arrList.add(300);
	arrList.add(2,400);
	System.out.println("Printing my Array List " + arrList);
	Collections.sort(arrList);
	System.out.println("Printing my sorted Array List " + arrList);	
	
	// remove duplicates from list
	for(int val : arrList) {
		/*
		 * if(set.add(val)) {
		 * 
		 * }
		 */
		if(set.add(val)!=true) {
			System.out.println("Found Duplicate items in the List" + val);
			//break;
			continue;
		}
		//System.out.println(val);
	}
	System.out.println("Printing my Set " + set);	
	ArrayList<Integer> newList = new ArrayList<>();
	for(int x : set) {
		newList.add(x);
	}
	System.out.println(newList);	
	Collections.sort(newList);
	//System.out.println(Collections.sort(newList));
	System.out.print(newList);
	
	ArrayList<Double> newListDouble = new ArrayList<>();
	newListDouble.add(10.10);
	newListDouble.add(10.12);
	System.out.println(newListDouble);
	
	ArrayList<Character> newListChar= new ArrayList<>();
	newListChar.add('A');
	newListChar.add('C');
	newListChar.add('A');
	
	Collections.sort(newListChar);
	System.out.println(newListChar);
	
	}
}
