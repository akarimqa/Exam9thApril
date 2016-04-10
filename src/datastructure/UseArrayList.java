package datastructure;
import java.util.*;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		List<String> list = new ArrayList<String>();
		//use od add
		list.add("NY");
		list.add("CA");
		list.add("AZ");
		list.add("MI");
		list.add("VA");
		// peek at the head of the list
		//	System.out.println("Head of the list:" + list.peek());
		System.out.println("This is the given Array List: ");
		System.out.println("============================= ");
		for (String city : list) {
			System.out.println(city);


		}
		list.remove(2); //removing AZ where index is 2
		System.out.println("This is the modified Array List: ");
		System.out.println("============================= ");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}

