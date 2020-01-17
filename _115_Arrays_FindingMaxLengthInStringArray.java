package Repl_it_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _115_Arrays_FindingMaxLengthInStringArray {

	/*
	 * Given the array words, it will print the word
	 * with the largest length. Assume that there are
	 * no 2 words with longest length
	 * 
	 * Example: words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
	 * prints jaaaaavvaaaaaaaaaa
	 */

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String[] words = new String[5];
//		for (int i = 0; i < 5; i++) {
//
//			words[i] = input.nextLine();
//
//		}
//
//		// write your code below
//
//		String longest = "";
//		
//		for(int i=0; i<words.length; i++) {
//			if(words[i].length() > longest.length()) {
//				longest = words[i];
//			}
//		}
//		System.out.println(longest);
		
		
		int[] arr = {12, 23, 34, 54, 78, 33, 19, 84, 5, 0, 4};
		
//		Arrays.sort(arr);
//		
//		System.out.println(arr[arr.length-1]);
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		System.out.println(max);
		
	}
}