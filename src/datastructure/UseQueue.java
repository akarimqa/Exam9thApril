package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> Myqueue = new LinkedList<String>();
		Myqueue.add("MA");
		Myqueue.add("MS");
		Myqueue.add("AL");
		System.out.println("This is the original Queue: ");
		System.out.println("============================= ");
		System.out.println(Myqueue.peek());
		//System.out.println(queue.peek());
		System.out.println(Myqueue.remove());
		System.out.println("This is the modifeied Queue after removing: ");
		System.out.println("============================= ");
		System.out.println(Myqueue.peek());

	}

}
