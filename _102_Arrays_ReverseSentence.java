package Repl_it_Tasks;

import java.util.Scanner;

public class _102_Arrays_ReverseSentence {

	/*
	 Given a String variable sentence, write code to type
	 each word in separate lines in a reverse order.
		
		Example:
		sentence -> "Java is fun"
		Print
		fun
		is
		Java
	 */
	
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    String sentence = input.nextLine();
		    
		    //TODO: Type your code below
		    
		String[] arr = sentence.split(" ");
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		    
		    
		    
		    
		    
}
}