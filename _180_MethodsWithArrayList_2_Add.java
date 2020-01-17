package Repl_it_Tasks;

import java.util.ArrayList;

public class _180_MethodsWithArrayList_2_Add {

	/*
	 We will be manipulating elements of an ArrayList by using List methods.

		The first List method we will learn is .add()
		
		The following code will take an ArrayList of Strings called strs and add "Hello" to it.
		str.add("Hello");
		
		The syntax follows something like:
		arraylistvariable.add(data to add);
		
		In the space to the left, add three names (any names) to the ArrayList called names.
	 */
	
	public static void main(String[] args) {
		
	ArrayList<String> names = new ArrayList<>();
	names.add("Ali");
	names.add("Veli");
	names.add("Deli");

		System.out.println(names);
		
		
	}

}
