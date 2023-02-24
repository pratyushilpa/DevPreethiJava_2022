package collections;
import java.util.ArrayList;
public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList <Integer> arrList = new ArrayList<>();
		  arrList.add(10);
		  arrList.add(20);
		  arrList.add(30);
		  arrList.add(50);
		  arrList.add(60);
		  
		  // int [] arr = new int[5];
		  int size = arrList.size() ;
		  Integer [] al = new Integer[size];
		  arrList.toArray(al);
		  System.out.println(arrList);
		  System.out.print("[");
		  for(int x : arrList) {
			  System.out.print(x + " ");
		  }
		  System.out.println("]");
		  
	}

}
