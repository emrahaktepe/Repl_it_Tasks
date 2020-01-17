package Repl_it_Tasks;

import java.util.Scanner;

public class _095_GetSandwich {

	/*
	 * A sandwich is two pieces of bread with something in between. Print the string
	 * that is between the first and last appearance of "bread" in the given string,
	 * or return string "nothing" if there are not two pieces of bread.
	 * 
	 * Example: input: breadjambread output: jam
	 * 
	 * Example: input: xxbreadjambreadyy output: jam
	 * 
	 * Example: input: xxbreadapple output: nothing
	 * 
	 * Example: input: breadbutterbread output: butter
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int count = 0;

//		for (int i = 0; i < str.length() - 4; i++) {
//			if (str.substring(i, i + 5).equalsIgnoreCase("bread")) {
//				count++;
//			}
//		}
//		if (count < 2) {
//			System.out.println("nothing");
		
		if (str.indexOf("bread") == str.lastIndexOf("bread")) {
			System.out.println("nothing");
		
		
		
		} else {
//		    	 str = str.replace("bread", "*");
//		    	 System.out.println(str);
			System.out.println(str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread")));
		}

	}
}
