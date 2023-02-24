package collections;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingList {

	public static void main(String[] args) {
		List ll = new ArrayList();
		ll.add(10);
		System.out.println(ll);
		ll.add(0,100);
		System.out.println(ll);
		ll.add(1000);
		ll.add(10);
		System.out.println(ll);
	}

}
