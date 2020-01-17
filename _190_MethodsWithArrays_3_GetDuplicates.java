package Repl_it_Tasks;

import java.util.Arrays;

public class _190_MethodsWithArrays_3_GetDuplicates {

	/*
	 * getDup accepts an array and returns an int.
	 * 
	 * If there is any element is duplicated, method counts how many of those
	 * present in the array. For example :
	 * 
	 * getDup(["1","2","aa"',"1"]) returns:2 ("1" is duplicated and there are two
	 * "1"s so return is 2)
	 * 
	 * getDup(["1","2","aa"',"1", "aa"]) returns:4 ("1" is duplicated and there are
	 * two "1"s and 2 "aa"s so return is 4)
	 * 
	 * getDup(["1","g","aabb',"7","7","2","aa"',"7"]) returns:3
	 */

	public static int getDup(String[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (frequency(arr, arr[i]) > 1) {
				count++;
			}
		}
		return count;
	}

	public static int frequency(String[] arr, String str) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] arr = { "1", "2", "aa", "1", "aa" };
		System.out.println(getDup(arr));
	}

}
