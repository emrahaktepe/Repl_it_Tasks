package Repl_it_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _192_MethodsWithArrayList_RepeatAll {

	/*
	 
	 	Create a static method that:
		is called repeatAll
		returns nothing
		takes in a single parameter - an ArrayList of Booleans
		
		This method should modify its ArrayList parameter by repeating its ArrayList values.  
		
		For example, if the parameter is 
		(true, false, false)
		The modified ArrayList should be
		(true, false, false, true, false, false)
	 
	 */
	
	public static void repeatAll(ArrayList<Boolean> list) {
		int size = list.size();
		
		for(int i = 0; i < size; i++) {
			list.add(list.get(i));
		}		
	}

	public static void main(String[] args) {
		
		ArrayList<Boolean> list = new ArrayList<>(Arrays.asList(true, false, false));
		
		repeatAll(list);
		

		
		System.out.println(list);
		
		
	}
	
}
