package Repl_it_Tasks;

import java.util.Scanner;

public class _097_EqualsJavaPython {

	/*
	 * Given a string, print out true if the number of appearances of "java"
	 * anywhere in the string is equal to the number of appearances of "python"
	 * anywhere in the string (case sensitive).
	 * 
	 * Example: input: We study java not python output: true
	 * 
	 * Example: input: What's the difference between java, javascript and python?
	 * output: false
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine();

		int javaCount = 0;
		int pythonCount = 0;

		for (int i = 0; i < sentence.length() - 3; i++) {
			if (sentence.substring(i, (i+4)).equals("java"))
				javaCount += 1;
			}
		for (int k = 0; k < sentence.length() - 5; k++) {
			if (sentence.substring(k, (k+6)).equals("python"))
					pythonCount += 1;
			}
			if (javaCount != pythonCount) {
				System.out.println("false");
			} else {
				System.out.println("true");
			}
		
	}
}