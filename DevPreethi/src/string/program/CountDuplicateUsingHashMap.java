package string.program;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicateUsingHashMap {

					public static void main(String[] args) {
				// ques - we want to count duplicate words 
						// Hello : 2
						// Java : 1
				String [] strArray = {"Hello" , "Java","Hello" , "Java" , "Java"};
				// Introducing to HashMap
				Map<String , Integer> mp = new HashMap<String , Integer>();
				/*
				 * System.out.println(mp); mp.put("Preethi", 101); mp.put("India", 1001);
				 * mp.put("Preethii", 101); System.out.println(mp);
				 */
				for(String  word : strArray) {
					Integer count = mp.get(word);
					if(count==null) {
						mp.put(word, 1);
					}
					else {
						mp.put(word, count+ 1);
					}
				}
				System.out.println(mp);
					}
}
