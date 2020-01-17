package Repl_it_Tasks;

import java.util.Scanner;

public class _101_Arrays_PrintFirstLastChar {

	/*
	 * Given a String array words, iterate through each word and print first and
	 * last letter of each element in separate lines.
	 * 
	 * Example:
	 * 
	 * words → ["hello", "why", "by", "apple" , "note"] 
	 * print: 
	 * ho 
	 * wy 
	 * by 
	 * ae 
	 * ne
	 */

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String[] words = { input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine() };

		// TODO: Write your code below
		
		for (int j=0; j<5; j++) {
			System.out.println(words[j].substring(0, 1) + words[j].substring(words[j].length()-1));
		}
		
		
	}
}