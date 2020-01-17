package Repl_it_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _190_MethodsWithArrayList_2Times {

	/*
	 		Create a method that:
			is called twoTimes
			returns a new ArrayList of Integers
			takes in a single parameter - an ArrayList of Integers
			
			This method should create a new ArrayList of Integers 
			that contains every value of the ArrayList parameter repeated twice.
			
			For example, if the parameter is
			(1,5,3,7)
			The method should return a new ArrayList of Integers with
			(1,1,5,5,3,3,7,7)
	 */
	
	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(2, 4, 6, 8));						
		System.out.println(twoTimes(numList));
		
	}
	
	public static ArrayList<Integer> twoTimes( ArrayList<Integer> numList ){
		
	ArrayList<Integer> numsNew = new ArrayList<>();
	
	for ( int i = 0; i < numList.size(); i++) {
		numsNew.add(numList.get(i));
		numsNew.add(numList.get(i));
	}

	return numsNew;
	}
	
}
