package Repl_it_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _192_MethodWithArrayList_10_TimesTwo {

	/*
	 	Create a method that:
		is called timesTwo
		returns nothing
		takes in a single parameter - an ArrayList of Integers called nums
		
		This method should take the ArrayList parameter 
		and multiply every value by two.
	 */
	
	public static void main(String[] args) {
		
		ArrayList <Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 6, 8));
		
		timesTwo(nums);
	}
	
	public static void timesTwo(ArrayList<Integer> nums) {
		
		for(int i = 0; i < nums.size(); i++) {
			nums.set(i, nums.get(i)*2);
		}
		System.out.println(nums);
	}
	
}
