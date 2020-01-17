package Repl_it_Tasks;

import java.util.Scanner;

public class _063_DuplicateIt {

	/*
	 You have 2 words
		Print the first word, second word,
		second word, first word
		
		Input:
		one
		two
		Output: 
		onetwotwoone
	 */
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String word1 = scan.next();
		    String word2 = scan.next();
		    //YOUR CODE HERE
		    
		String str1 = word1 + word2;
		String str2 = word2 + word1;
		
		System.out.println(str1 + str2);
		    
		    
}
}