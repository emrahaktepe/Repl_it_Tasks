package Repl_it_Tasks;

import java.util.Scanner;

public class _073_Email_2 {

	/*
	 Write a program that will print out information
	 about user based on email. Print first and last
	 name from the upper case.

		Example:
		Input: craig_federighi@apple.com
		Output: 
		First name: Craig
		Last name: Federighi
		Domain: apple
		Top-Level Domain: com
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    String email = scan.next();
	    
	    String name = email.substring(0,1).toUpperCase() + (email.substring(1, email.indexOf("_")));
	    String lastName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase() + email.substring(email.indexOf("_")+2, email.indexOf("@"));
	    String domain = email.substring((email.indexOf("@")+1), (email.indexOf(".")));
	    String extension = email.substring(email.lastIndexOf(".")+1);
		
		System.out.println("First Name: " + name
							+ "\nLast Name: " + lastName
							+ "\nDomain: " + domain
							+ "\nTop-Level Domain: " + extension);
		
		
	}
}
