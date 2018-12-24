package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */

		List<Integer> l = new ArrayList<Integer>();
		l.add(222);
		l.add(333);
		l.add(444);
		l.add(555);
		l.add(666);
		l.add(777);


		for (Integer i : l) {
			System.out.println("The value of this ArrayList is  " + " " + i);
		}
		System.out.println("This is showing While Loop ");
		Iterator it = l.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());


		}
	}
}
