package Repl_it_Tasks;

import java.util.Scanner;

public class _065_MiddleThree {

	/*
	 	You have a word, do the following:

		If the word has odd number of characters
		and has 5 or more characters, print the
		middle three characters of the word. 
		
		Otherwise print "invalid".
		
		fifteen ==> fte
		apple ==> ppl
		hey ==> invalid
		java ==> invalid
		whatsup ==> ats
		$ ==> invalid
	 */
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE
	 int wL = word.length();
	    if ( wL % 2 != 0 && wL >= 5) {
	    	System.out.println(("" + word.charAt(wL/2-1)+word.charAt(wL/2)+word.charAt(wL/2+1)));
	    }
	    else {
	    	System.out.println("invalid");
	    }
}
}