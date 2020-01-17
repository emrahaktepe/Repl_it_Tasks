package Repl_it_Tasks;

import java.util.Scanner;

		/*
		In this exercise you get a string called txt .
		output txt without its last letter.

		for example:
		txt = "foo"

		output will be:
		fo
		 */

public class _079_StringNoEnd {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String txt = s.next();
	    //your code here	
	
	System.out.println(txt.substring(0, (txt.length())-1));
	
	
	
	
}
}