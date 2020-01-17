package Repl_it_Tasks;

import java.util.Scanner;

public class _069_PrintHalfTwice {

	/*
	 Write a program that will print out
	 first half of the word twice. 

		Example:
		
		input: java
		output: jaja
	 */
	
	 public static void main(String[] args) {
   
	Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    //WRITE YOUR CODE HERE
    String first2 = word.substring(0, (word.length()/2));
    System.out.println(first2.repeat(2));
    
    
    
    
  }
}
