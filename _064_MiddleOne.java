package Repl_it_Tasks;

import java.util.Scanner;

public class _064_MiddleOne {

		/*
		  You have a word, do the following:

			1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
      				oak ==> a
      				javav ==> v
            - Single character, print that character 3 times
      				# ==> ###
      				q ==> qqq

			2. When word has even number of characters and:
           - 4 or more characters, print middle 2
				     java ==> av
				     apples ==> pl
				     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
				      @@ ==>@@@@
				      $$ ==>$$$$
				      hi ==> hihi
		 */
	
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    //YOUR CODE HERE
	    
	    int wL = word.length();
	    
	 if(wL % 2 != 0) {
		 if(wL >= 3) {
			 System.out.println(word.charAt(wL/2));
		 }
		 else {
			 System.out.println(word.repeat(3));
		 }
	 }
	 else {
		 if(wL >= 4) {
			 System.out.println("" + word.charAt(wL/2) + word.charAt(wL/2+1));			 
		 }
		 else {
			 System.out.println(word.repeat(2));
		 }
	 }
	    
}
}