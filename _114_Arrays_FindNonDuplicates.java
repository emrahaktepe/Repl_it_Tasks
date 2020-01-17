package Repl_it_Tasks;

import java.util.Scanner;

public class _114_Arrays_FindNonDuplicates {
	
	
	/*
	 Given an array nums with 7 integers every element
	 is repeated twice - except one.
	 Find that element and print it to console.

			Example:
			nums -> [1, 1, 2, 3, 4, 3, 4]
			         2
	 */

	public static int  countNum(int[] arr, int num) {
	    int count = 0;
		for(int i=0; i<arr.length; i++) {
			   if (arr[i] == num)
				   count++;
		}
		return count;
	}
	
	  public static void main (String[] args) {
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
	
		    for(int i=0; i<nums.length; i++) {
		    	if(countNum(nums, nums[i]) == 1) {
		    	System.out.println(nums[i]);
		    	break;
		    	}
		    }
		   
		    
		  
		    
		    
		    
		    
		    
}
}