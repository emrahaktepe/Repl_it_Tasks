package Repl_it_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _149_Methods_AddToArray {

	/*
	 add_to_r is a method that gets an array and a number.

		the method creates a new array bigger by one then (int[] r).
		It populates the new array with the old ones(r) values.
		and finally in the last position adds the number (int n) to it.
		
		for example:
		
		method input: add_to_r(new int{1,5,77,8}  ,2)
		
		outputs (int array):
		[1, 5, 77, 8, 2]
	 */
	
	  public static void add_to_r(int[] arr, int addition) 
		{
			//create new array with one more position.
		  int[] newArr = new int[arr.length+1];
		  for(int i = 0; i < arr.length; i++) {
				 newArr[i] = arr[i];
			 }
		  newArr[newArr.length-1] = addition;
		  System.out.println(Arrays.toString(newArr));
		}
	  
	  public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
	    int size = input.nextInt();
	    int addition = input.nextInt();
	    
	    int[] arr = new int[size];
	    for(int i=0 ;i<=size-1;i++){
	        arr[i]=input.nextInt();
	    }
	    
	     add_to_r(arr, addition);
	   
	    
	  }
	}
	
	

