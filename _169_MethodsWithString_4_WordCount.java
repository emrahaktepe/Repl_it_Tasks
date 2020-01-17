package Repl_it_Tasks;

public class _169_MethodsWithString_4_WordCount {

	/*
	 This method gets a string and returns the word count of that string.

		example:
		
		wordCount("foo bar")
		returns 2
		
		wordCount("one two three")
		returns 3
		
		wordCount("bla")
		returns 1
		
		hint:
		
		https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#split(java.lang.String)
	 */
	
	public static void main(String[] args) {
		
		System.out.println(wordCount("ben bir cesme yaptirdim mermer tasindan"));
		
	}
	
	 public static int wordCount(String words) {
		   
		 int count = 0;
		 for(int i=0; i<words.length(); i++) {
			 if(words.substring(i, i+1).equals(" "))
				 count++;
		 }
	     count = count+1;
	     return count;
	  }
	
}
