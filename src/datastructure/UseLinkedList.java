package datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseLinkedList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use LinkedList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */


//use od add
		List<String> list = new ArrayList<String>();
		list.add("NY");
		list.add("CA");
		list.add("AZ");

//        for(String city:list){
//             System.out.println(city);
//        }
		System.out.println("This is the original LinkedList: ");
		System.out.println("============================= ");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		list.remove(2);
		System.out.println("This is the modifeied LinkedList: ");
		System.out.println("============================= ");
		for(String city:list){
        System.out.println(city);
   }
	}

}
