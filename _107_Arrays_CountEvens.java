package Repl_it_Tasks;

import java.util.Scanner;

public class _107_Arrays_CountEvens {

	/*
	 Given an array nums, calculate count of even
	 numbers in nums and print out to console.

			nums → [2, 1, 2, 3, 4]) → 3
			nums → [2, 2, 0, 3, 5]) → 3
			nums → [1, 3, 5, 7, 9]) → 0
	 */
	
	
	public static boolean isEvenNumbers(int num) {
		if(num%2==0)
			return true;
		return false;
		// if function runs the first line returns true, if not goes to the next
		// that's why you don't need else statement
		// if true it doesn't move to the next line
	}
	
	  public static void main(String[] args) {
		    
		    Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: Write your code below
	
		    int count = 0;
		    
		    for(int i=0; i<nums.length; i++) {
		    	if(isEvenNumbers(nums[i])) {
		    		count++;
		    	}
		    }
	System.out.println(count);
}
}