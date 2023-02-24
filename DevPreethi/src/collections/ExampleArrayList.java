package collections;
import java.util.ArrayList;

public class ExampleArrayList {

	public static void main(String[] args) {
	ArrayList<Integer> arrList = new ArrayList<Integer>();
	 if(arrList.isEmpty()) {
		 arrList.add(10);
		 arrList.add(20);
		 arrList.add(30);
		 System.out.println(arrList);
		 arrList.add(1,60);
		 System.out.println(arrList);
		 System.out.println(arrList.size());
	 }
	 // [10, 60, 20, 30]
	 for(int i = 0 ; i <arrList.size();i++) {
		 System.out.println(arrList.get(i));
		 if(arrList.get(i)==10) {
			 System.out.println("Found the element as " + arrList.get(i));
		 }
	 }
	//System.out.println( arrList.toArray().toString());
	  Object[] obj  = arrList.toArray();
	  System.out.println(obj.length);
	  System.out.print("[");
	  for(Object ob : obj) {
		  System.out.print(ob +" ");
	  }
	  System.out.println("]");
	}

}
