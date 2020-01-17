package Repl_it_Tasks;

public class _166_MethodsWithString_1_MergeThem {

	/*
	 When gears merge and work together, 
	 one teeth from each one goes in order.
		
	 Write a method mergeStrings that will return
	 the strings merged, one letter at a time, starting with one.
	 Please note one and two can be of different lengths.
	 Please look at below examples:
		
		s1 ==> "12345"
		s2 ==> "abcde"
		mergeStrings(s1,s2) ==> "1a2b3c4d5e"
		
		mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
		
		mergeStrings("java", "selenium") ==> "jsaevlaenium"
	 */
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println(mergeStrings("123456", "menemen"));
		
	}
	
	public static String mergeStrings(String one, String two) {
		String merged = "";
		
		int longer = (one.length() > two.length()) ? one.length() : two.length();
		int shorter = (one.length() < two.length()) ? one.length() : two.length();
		
		String longR = (one.length() > two.length()) ? one : two;
		String shortR = (one.length() < two.length()) ? one : two;
		
		for(int i=0; i<shorter; i++) {
			merged += one.substring(i, i+1).concat(two.substring(i, i+1));
	}
		merged = merged + (longR.substring(longR.length()-(longer-shorter)));
	return merged;
}
}