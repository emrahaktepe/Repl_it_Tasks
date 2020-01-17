package Repl_it_Tasks;

import java.util.Arrays;

public class _178_MethodsWithArrays_1_MergeArrays {

	/*
	 mergR merges two arrays into one.
		
		it gets two int arrays and returns an int array
		
		for example:
		
		mergR([1,2,3],[4,5,6])
		returns [1,2,3,4,5,6]
		
		mergR([1,2],[6,8])
		returns [1,2,6,8]
		
		hint:
		create a length int for the combined length of both arrays.
		create an array with that length (thats the array we will return).
		create an iterator for both arrays (int z=0).
		
		loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
		then increment the iterator for both arrays (z++).
		
		do the same for the second array.

	 */
	
	public static void main(String[] args) {
	
		int[] a = {1, 2, 3, 4};
		int[] b = {5, 6, 7, 8};
		
		
		
		int[] merged = mergR(a, b);
		System.out.println(Arrays.toString(merged));	
		
	}
	
	  public static int[] mergR(int[] a,int[] b) {
		  
		 int[] merged = new int[a.length+b.length]; 
		 
		 
		 
		 for(int i = 0; i < a.length; i++) {
			 merged[i] = a[i];
		 }
		 
		 
		 
		 for(int i = 0; i < b.length; i++) {
			 merged[a.length+i] = b[i];
		 }
		 
		 
		  return merged;
	  }

}
