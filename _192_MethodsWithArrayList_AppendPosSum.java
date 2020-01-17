package Repl_it_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _192_MethodsWithArrayList_AppendPosSum {

	/*
	 	Create a static method that:

		is called appendPosSum
		returns an ArrayList of Integers
		takes one parameter: an ArrayList of Integers
		 
		This method should:
		Create a new ArrayList of Integers
		Add only the positive Integers to the new ArrayList
		Sum the positive Integers in the new ArrayList and
		add the Sum as the last element
		
		For example, if the incoming ArrayList contains the Integers 
		(4,-6,3,-8,0,4,3), the ArrayList that gets returned should be 
		(4,3,4,3,14), with 14 being the sum of (4,3,4,3).  
		The original ArrayList should remain unchanged.
	 */
	
	public static ArrayList<Integer> appendPosSum (ArrayList<Integer> list){		
		ArrayList<Integer> newList = new ArrayList<>();				
		int sum = 0;
		for(int num : list) {
			if(num > 0) {
				newList.add(num);
				sum += num;
			}
		}		
		newList.add(sum);		
		return newList;
	}
	
	public static void main(String[] args) {		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4, -6, 3, -8, 0, 4, 3));				
		System.out.println(appendPosSum(list));
		
	}
	
}
