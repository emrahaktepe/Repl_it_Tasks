package Repl_it_Tasks;

import java.util.Scanner;

public class _087_HasJava {

	/*
	 Given a string word, print true if "java"
	 appears starting at index 0 or 1 in the
	 string, such as with "javaxxx" or "xjavaxx"
	 but not "xxjavaxx". The string may be any
	 length, including 0word = . 

			Example:
			input: javapython
			output: true
			
			Example:
			input: cjavac++
			output: true
			
			
			Example:
			input: c#javaruby
			output: false
	 */
	
	public static void main(String[] args) {
	    boolean exists = false;
	    Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    
	    
	if(word.length() >=4) {
		if((word.substring(0,4).contains("java")) || (word.substring(1,5).contains("java"))){ 
			System.out.println(!exists);
			}
		else {
			System.out.println(exists);
		}
	}
		else {
			System.out.println(exists);    
		}
    
    
	    
	    
	    
	  }
}
