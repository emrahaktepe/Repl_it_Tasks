package Repl_it_Tasks;

import java.util.*;

public class _170_MethodsWithStringg_5_CleanString {

	/*
		This method gets two strings (text and badWord) and returns a string.
		
		Basically what it does is take out all the occurrences of badWord in text.
		
		for example:
		
		clean ("one two three","two")
		returns "one three"
		
		clean ("foo bar","foo")
		returns "bar"
		
		clean ("he said bla bla bla","bla")
		returns "he said "
		
		hint:
		
		https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#replace(char,%20char)
	 */
	
	public static void main(String[] args) {
		
		String out = clean("bir iki uc dort bes alti yedi sekiz dokuz on", "on");
		
		System.out.println(out);
		

	}
	
	
	public static String clean(String text, String badWord) {
		
		for(int i = 0; i <= text.length()-badWord.length(); i++) {
			if((text.substring(i, i+badWord.length())).equals(badWord)) {
				text = text.replace(badWord, "");
				text = text.replace("  ", " ");

			}
			
			
		}
		return text;
		
	}
	
}
