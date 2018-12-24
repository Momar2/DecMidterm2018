package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		*/

		Queue<Integer> newQ = new LinkedList<Integer>();

		newQ.add(78);
		newQ.add(34);
		newQ.add(98);
		newQ.add(23);
		newQ.add(79);


		System.out.println(newQ.peek());
		System.out.println(newQ.poll());
		System.out.println(newQ.peek());
		System.out.println(newQ.remove());
		System.out.println(newQ.peek());



		System.out.println("Retrieved data through for each Loop: ");
		for (Integer in : newQ) {
			System.out.println(in);
		}



	}
}