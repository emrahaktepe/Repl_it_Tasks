package Repl_it_Tasks;

import java.util.Scanner;

public class _074_SMSMessage {

	/*
	 We have a message variable already declared
	 and assigned a value in this format

		Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

		Variables are already declared:

		sender, phoneNumber, messageBody
		- by using String methods:
		retrieve related information from SMSmessage string and assign to those 3 variables.
		-print each variable in separate line

		Sender: Mike Smith
		Phone Number: 202-123-3456
		Message body: I love programing and problem solving
	 */
	
	
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    String message = scan.nextLine();
		    String sender = message.substring(message.indexOf("<")+1, message.indexOf(">"));
		    String phoneNumber = message.substring(message.indexOf("[")+1, message.indexOf("]"));
		    String messageBody = message.substring(message.indexOf("{")+1, message.indexOf("}"));
	
	
	System.out.println("Sender: " + sender
						+ "\nPhone Number: " + phoneNumber
						+ "\nMessage body: " + messageBody);
	
	
}
}