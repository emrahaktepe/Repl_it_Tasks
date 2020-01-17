package Repl_it_Tasks;

import java.util.Scanner;

public class _071_Alejandro_2 {

	/*
		As Alejandro is time is precious and even with
		his little knowledge of programming he managed
		to save some time. Though he still had a lot of
		emails to read.
		
		He wants to add more conditions to his program,
		he wants only job related mails so he will narrow
		it down by also checking if the word "project"
		appears beside his name, that way he will be sure 
		that its a job related email that refers to him.
		 
		for example:
		a = "dear alejandro.....alot of text"
		outputs: "dont read"
		
		a = "thunder blaz is the best drink in the galaxy..."
		outputs: "dont read"
		
		a = "subject : important project, alejandro we refer to you  this ...."
		outputs: "read this mail"
	 */
	
	  public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    String a = s.nextLine();

		    //your code here

		    if ( a.contains("alejandro") && a.contains("project")) {
		    	System.out.println("read this email");
		    }
		    else {
		    	System.out.println("dont read");
		    }
		    
}
}