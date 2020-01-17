package Repl_it_Tasks;

import java.util.Scanner;

		/*
		 Write a program that will print out letters
		 in the alphabetic order accordingly to the
		 given range within 2 chars. 

			Example:
			input: A
			input: Z
			output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
			
			Example:
			input: a
			input: f
			output: abcdef
			
			Example:
			input: a
			input: d
			output: abcd
			
			Example:
			input: B
			input: O
			output: BCDEFGHIJKLMNO
		 */

public class _088_PrintLetters {

	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    char start = scan.next().charAt(0);
	    char end = scan.next().charAt(0);
	
		int letters = 0;
	    for (char ch=start; ch<=end; ch++) {
	    	letters += ch;
	    	System.out.println(ch);
	    }
}
}