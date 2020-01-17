package Repl_it_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _151_Methods_PrintUniqueNumbers {

	/*
	 * Write a void method printUniqueNumbers that will print unique numbers from an
	 * array of ints.
	 * 
	 * Example: input:[2, 5, 5, 6, 3, 6, 9, 34, 3] output: 2 9 34
	 */

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    int size = scan.nextInt();
	    int[] nums = new int[size];
	    for(int i=0; i < size; i++){
	      nums[i] = scan.nextInt();
	    }
	    printUniqueNumbers(nums);
	  

	}

	public static int countR(int[] nums, int number) {

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == number) {
				count++;
			}
		}

		return count;
	}

	public static void printUniqueNumbers(int[] nums) {

		for (int i = 0; i < nums.length; i++) {

			if (countR(nums, nums[i]) == 1) {
				System.out.println(nums[i]);
			}

		}
	
	}

}