package Repl_it_Tasks;

import java.util.Scanner;

public class _108_Arrays_SplitEmail {

	/*
	 Given a String variable email, write code using
	 split method to print email id and domain in
	 separate lines.

			Example:
			email -> info@cybertekschool.com
			
			Print:  
			Email id: info
			Email domain: cybertekschool.com
			
			
			If email contains no @ character or multiple @ characters then print invalid email:
			
			email -> hello-gmail.com
			print:  
			invalid email
			
			email -> my@fancy@email.com
			print:  
			invalid email
	 */
	
	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
		    String email = input.nextLine();
		    
		    //Write your code below
		
		String[] arrStr = email.split("@");
		if(!email.contains("@") || arrStr.length>2){
			System.out.println("invalid email");
			return;
		}
		System.out.println("Email id: " + arrStr[0]);
		System.out.println("Email domain: " + arrStr[1]);

		    
		    
		    
		
	}
	
}
