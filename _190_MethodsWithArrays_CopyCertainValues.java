package Repl_it_Tasks;

import java.util.Arrays;

public class _190_MethodsWithArrays_CopyCertainValues {

	/*
	 * Given a String array arr with the following elements ["zero", "one",
	 * "two","three","four"]
	 * 
	 * Create another array fewValues and copy words that have letter "e" in them
	 * 
	 * You need to know how many element contain "e" and create array accordingly
	 * 
	 * Values in fewValues array need to be["zero", "one","three"]
	 * 
	 * Examples: arr -> ["aa", "be", "lol", "lel", "oreo"] fewValues -> ["be",
	 * "lel", "oreo"]
	 * 
	 * arr -> ["e", "hey", "bye", "furey", "spoon"] fewValues ->["e", "hey", "bye",
	 * "furey"]
	 */

	public static void main(String[] args) {

		System.out.println("-----EXAMPLE RUN ---------");
		String[] numbers = { "zero", "one", "two", "three", "four" };

		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].contains("e")) {
				count++;
			}
		}
		
		String[] itemsWithE = new String[count];

		int j = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i].contains("e")) {
				itemsWithE[j] = numbers[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(itemsWithE));

	}

//	public static String[] getWithE(String[] numbers) {
//		int count = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i].contains("e")) {
//				count++;
//			}
//		}
//		String[] itemsWithE = new String[count];
//		for (int i = 0; i < numbers.length; i++) {
//			if(numbers[i].toLowerCase().contains("e")) {
//				numbers[i] = itemsWithE[i];
//			}
//		}
//		return itemsWithE;
//	}
}
