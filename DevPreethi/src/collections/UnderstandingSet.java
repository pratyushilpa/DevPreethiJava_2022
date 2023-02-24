package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnderstandingSet {
static ArrayList <Integer> al = new ArrayList<>();
static LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

	public static void main(String[] args) {
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(20);
		
		System.out.println(al);
		// HashSet - class 
		// TreeSet - class
		// LinkedhashSet  - class
		Set<Integer> set = new HashSet<>();
		set.addAll(al);
		System.out.println(set);
		
		lhs.add(10);
		lhs.add(20);
		lhs.add(30);
		lhs.add(40);
		lhs.add(20);
		System.out.println(lhs);
	}

}
