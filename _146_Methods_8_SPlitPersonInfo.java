package Repl_it_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class _146_Methods_8_SPlitPersonInfo {

	/*
	 * The method person gets a string with this format : "name,last name,age" for
	 * example:
	 * 
	 * person("jon,doe,30"); the output is: person name: jon last name: doe age: 30
	 * 
	 * hint: use the split method to split the string to a string array where there
	 * is a "," char
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
		person(s);

	}

	public static void person(String info) {

		// your code here
		
		String[] Person = info.split(",");
//		System.out.println(Person[2]);
		System.out.println("person name: " + Person[0] + " last name: " + Person[1] + " age: " + Person[2]);

	}// end person

}
