package Repl_it_Tasks;

import java.util.Arrays;

public class _195_MethodsWithString_15_Anagram {

	/*
	 
	 	Anagram is a word, phrase, or name formed by rearranging
	 	the letters of another, such as cinema, formed from iceman.

		isAnagram method checks if word1 and word2 are anagram to
		each other then return a boolean.
		
		each letter in word1 should appear in word2 exact number of times
		ignore empty spaces
		make your code case insensitive
		
		Examples:
		
		isAnagram("listen", "Silent") ==> true
		
		isAnagram("earth", "heart") ==> true
		
		isAnagram("star", "rats") ==> true
		
		isAnagram("hi", "bye") ==> false
		
		isAnagram("java", "cava") ==> false
	 
	 
	 */
	
	public static boolean isAnagram(String word1, String word2) {
		
		word1 = word1.replace(" ", "").toLowerCase();
		word2 = word2.replace(" ", "").toLowerCase();
		
		int n1 = word1.length();
		int n2 = word2.length();
		
		if (n1!=n2)
			return false;
		
		char[] newA = new char[word1.length()];
		char[] newB = new char[word2.length()];
		
		
		for( int i = 0; i < word1.length(); i++) {
			newA[i] = word1.charAt(i);
		}
		
		for( int i = 0; i < word1.length(); i++) {
			newB[i] = word2.charAt(i);
		}
		
		
		Arrays.sort(newA);
		Arrays.sort(newB);

		
		for( int i = 0; i < word1.length(); i++)
			if(   newB[i] != newA[i]  )
				return false;
		
		return true;
		
		
	}
	
	public static void main(String[] args) {
		

		String a = "kisten";
		String b = "sikent";		
	
		boolean result = isAnagram(a, b);
		System.out.println(result);
		
	
	}
	
}
