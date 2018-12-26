package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 */
		Queue<Integer> qn= new LinkedList<Integer>();
		// Add elements to Queue.
		qn.add(888);
		qn.add(444);
		qn.add(222);
		qn.add(777);
		qn.add(111);
		System.out.println("integer queue");



		//Applied peek, poll, remove
		System.out.println(qn.peek());
		System.out.println(qn.poll());
		System.out.println(qn.peek());
		System.out.println(qn.remove());
		System.out.println(qn.peek());

		//Use of For Each loop  to retrieve data.

		System.out.println("Use of for each loop to retrieve data: ");
		for (Integer in : qn) {
			System.out.println(in);
		}

		//Use of while loop with Iterator to retrieve data.
		System.out.println("Use of while loop to retrieve data: ");
		Iterator itr = qn.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println(i);
		}

	}
}