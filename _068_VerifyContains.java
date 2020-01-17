package Repl_it_Tasks;

import java.util.Scanner;

public class _068_VerifyContains {

	/*
	 Write a program that will verify if
	 the word is contained in the sentence.
	 Print out the result as boolean value. 
	 */
	
	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    String sentence = scan.nextLine();
    //WRITE YOUR CODE HERE
    
    if (sentence.contains(word)) {
    	System.out.println("True");
    }
    else {
    	System.out.println("False");
    }
    
    
    
}
}