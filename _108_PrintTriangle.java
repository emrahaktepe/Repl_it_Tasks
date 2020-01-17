package Repl_it_Tasks;

import java.util.Scanner;

public class _108_PrintTriangle {

	/*
	 Assume that the int variables i and j have been declared,
	 and that n has been declared and initialized.

	Using for loops (you may need more than one), write code
	that will cause a triangle of asterisks of size n to be 
	output to the screen.

			Example:
			input: 5
			output: *
			output: **
			output: ***
			output: ****
			output: *****
			
			Example:
			input: 3
			output: *
			output: **
			output: ***
	 */
	
	public static void main(String[] args) {
		
		int i = 1;
		int j = 1;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (j = 1; j <= n; j++) {
			for (i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
	}
}
