package math;
import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 */
		int  array[] = new int[]{110,99,34,67,89,67,456,321,456,78,90,45,32,56,78,90,54,32,123,67,5,679,54,32,65};


		Arrays.sort(array);
		System.out.println("The lowest number from this array is: "+ array[0]);

		//char[] a = {'3', '5', '1', '4', '2'};

		//List b = Arrays.asList(ArrayUtils.toObject(array));

		//System.out.println(Collections.min(b));
		
		
	}

}
