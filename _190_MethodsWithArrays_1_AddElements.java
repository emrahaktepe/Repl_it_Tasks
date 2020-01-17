package Repl_it_Tasks;

import java.util.Arrays;

public class _190_MethodsWithArrays_1_AddElements {

	// Method addElements accepts 2 int arrays and adds each element
	// value of two arrays and returns a new array.
	// You can assume that each array has 5 elements

	// addElements(new int[][10, 40, 50, 3, 1],
	// new int[][11, 0, 500, 44, 1101]);
	// return array after adding values in the arrays:
	// [21, 40, 550, 47, 1102]

	public static int[] addElements(int[] arr1, int[] arr2) {

		int[] newArr = new int[arr1.length];

		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr1[i] + arr2[i];
		}

		return newArr;
	}

	public static void main(String[] args) {

		int[] arr1 = { 3, 5, 7, 9, 11 };
		int[] arr2 = { 10, 20, 30, 40, 50 };

		System.out.println(Arrays.toString(addElements(arr1, arr2)));

	}

}
