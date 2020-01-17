package Repl_it_Tasks;

import java.util.Scanner;

public class _089_RepeatSeparator {

	/*
	 Given two strings, word and a separator,
	 return a string made of count occurrences
	 of the word, separated by the separator string.

			Example:
			input: Word
			input: X
			input: 3
			output: WordXWordXWord
			
			Example:
			input: This
			input: And
			input: 2
			output: ThisAndThis
			
			Example:
			input: This
			input: And
			input: 1
output: This
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String word = scan.next();
	    String separator = scan.next();
	    int count = scan.nextInt();
		
	for(int i=0; i<count; i++) {
		System.out.print(word);
		if(i==count-1)
			continue;
		System.out.print(separator);
	}
		
		
		
		
		
		
		
		
		
		
	}
}
