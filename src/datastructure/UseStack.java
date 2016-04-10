package datastructure;

import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,remove,pop elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Stack<String> stack = new Stack<String>();
		stack.push("DK");
		stack.push("Chitta");
		stack.push("Khulna");
		stack.push("Rajshahi");
		System.out.println(stack.peek());

		stack.remove(3);
		System.out.println(stack.pop());
	}

}
