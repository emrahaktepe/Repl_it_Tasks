package Repl_it_Tasks;

import java.util.Scanner;

public class _070_Alejandro_1 {

	/*
	 	Alejandro have started learning java,
	 	he knows what you know about ifs and strings.

		He has a large number of text emails, going
		trough all of them will take a lot of time.
		To save time he will only read the emails 
		that refer to him by name.

		He wants to write a program that gets a string
		(the email) and determines if his name "alejandro"
		appears in that string. if so it will output "read 
		this mail" else it will output "dont read".

		for example:

		a = "dear alejandro.....alot of text"
		outputs: "read this mail"

		a = "thunder blaz is the best drink in the galaxy..."
		outputs: "dont read"

		a = "subject : important project, alejandro we refer to you  this ...."
		outputs: "read this mail"
	 */
	  public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String a = s.nextLine();

		    //your code here
	
	    if ( a.contains("alejandro")) {
	    	System.out.println("read this email");
	    }
	    else {
	    	System.out.println("dont read");
	    }
	    
	    
}
}