package Repl_it_Tasks;

import java.util.Arrays;

public class _190_MethodsWithArrays_1_DeleteElement {

	// deleteR, gets an int array, and an int. the method returns an int array.

	// It removes element int from the array.

	// example use (pseudo code):

	// deleteR([1,2,3],2)
	// returns [1,3]

	// deleteR([19,99,9,9999],9)
	// returns [19,99,9999]
	//
	// deleteR([1,5,3,4],5)
	// returns [1,3,4]

	// hint:

	// create a new array for return with -1 the length of arr

	// And add all elements from arr except for the element that matches element
	// value
	// return that new array

	public static int[] deleteR(int[] arr, int num) {

		int[] newArr = new int[arr.length-1];

		for (int j = 0; j<newArr.length; j++) {
			for (int i = 0; i<arr.length; i++) {
				if(arr[i] != num) {
					newArr[j++] = arr[i];
				}
			}
		}
		return newArr;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 6, 9, 12, 15, 18 };
		int num = 9;

		System.out.println(Arrays.toString(deleteR(arr, num)));

	}

}
