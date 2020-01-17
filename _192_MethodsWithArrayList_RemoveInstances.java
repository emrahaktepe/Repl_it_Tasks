package Repl_it_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _192_MethodsWithArrayList_RemoveInstances {

	/*
	 		This method gets an arraylist of Integers and a number(Integer).
	 		It returns an arraylist.

			It removes any instance of the number it gets from the arraylist.
			
			for example:
			
			romoveInst([1,1,2,3,1,4],1)
			returns: [2,3,4]
			
			romoveInst([3,4,3,3],4)
			returns: [3,3,3]
	 */
	
	public static ArrayList<Integer> removeInst(ArrayList<Integer> list, Integer num) {
	   
		for ( int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(num)) {
				list.remove(list.get(i));
				i--;
			}
			
		}
		return list;
	}

	public static void main(String[] args){
	  
	    ArrayList<Integer> list = new ArrayList<>();
	    Integer[] nums = new Integer[]{1,1,2,3};
	    list.addAll(Arrays.asList(nums));
	    
	    System.out.print(removeInst(list,1));
	   
	    
	  }
	
	
}
