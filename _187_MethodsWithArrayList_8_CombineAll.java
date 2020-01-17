package Repl_it_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _187_MethodsWithArrayList_8_CombineAll {

	/*
	 		Create a static method that:
			is called combineALL
			returns an ArrayList
			takes two parameters: an ArrayList of Strings called wordList1, 
			and an ArrayList of Strings called wordList2
			
			This method should create a new ArrayList of Strings, 
			add all the words (in order) from wordList1, 
			then add all the words (in order) from wordList2.
			In other words, it is combining all the elements from the two parameters.
	 */
	
	public static ArrayList<String> combineAll(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		
		ArrayList<String> combined = new ArrayList<>();
		
		combined.addAll(wordList1);
		combined.addAll(wordList2);

		
//		for(int i = 0; i < wordList1.size(); i++) {
//			combined.set(i, wordList1.get(i));
//		}
//		for(int i = 0; i < wordList2.size(); i++) {
//			combined.set(i+wordList1.size(), wordList2.get(i));
//		}
		
		return combined;
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> wordList1 = new ArrayList<>(Arrays.asList("Bir", "Iki", "Uc", "Dort", "Bes"));
		ArrayList<String> wordList2 = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Four", "Five"));
		
		combineAll(wordList1, wordList2);
		
	}
	
}
