package Repl_it_Tasks;

import java.util.Scanner;

public class _067_ReverseIt {
	 
		/*
		 Write a program that will reverse a string. 
		 Your program should reverse a string only 
		 5 characters long. 
		 If word is shorter, print out: "Too short!". 
		 If word is longer, print: "Too long!". 
		 Otherwise, reverse this word and print out
		 result into the console. 
	
				Example:
				input: cat
				output: Too short!
				
				Example:
				input: singularity
				output: Too long!
				
				Example:
				input: apple
				output: elppa 
		 */
	
	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word = scan.next();
		    //WRITE YOUR CODE HERE
		    
		    int wL = word.length();
		    String reverse = "";
	
		    if ( wL == 5) {
		    for ( int i = wL-1; i >= 0; i--) {
		    	reverse += word.charAt(i);
		    }
		    System.out.println(reverse);
		    }
		    else {
		    	if(wL > 5) {
			System.out.println("Too long!");
		    }
		    	else {
			System.out.println("Too short!");
		    }
		  }
		    
		    
		    
	}
}