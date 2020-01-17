package Repl_it_Tasks;

import java.util.Scanner;

public class _092_Factorial {

	/*
	 In mathematics, the factorial of a positive integer n,
	 denoted by n!, is the product of all positive integers
	 less than or equal to n.  Calculate factorial and
	 output result to the console. 

		Example:
		input: 5
		output: 120
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    
	    long multiply = 1L;
		
		for(int i=n; i>0; i--) {
			multiply *=i;
		}
		System.out.println(multiply);
		
		
	}
}
