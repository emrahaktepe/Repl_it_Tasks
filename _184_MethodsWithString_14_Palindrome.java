package Repl_it_Tasks;

public class _184_MethodsWithString_14_Palindrome {

	/*
	 Palindrome is a word, phrase, or sequence that reads
	 the same backward as forward, e.g., madam or nurses run.

		So method isPalindrome checks that and returns true
		if check is palindrome and false if it is not.
		
		- make your conditions case insensitive.  
			ex: Civic and civic are both palindromes
		- make your conditions space insensitive.
			ex: Race car is a palindrome even though there is space in between.
		
		Examples:
		
		isPalindrome("Noon") ==> true
		
		isPalindrome("I am not palindrome") ==> false
		
		isPalindrome("wooden") ==> false
		
		isPalindrome("Nurses Run") ==> true
	 */
	
	public static void main(String[] args) {
		
		
		boolean result = isPalindrome("honda");
		System.out.println(result);
		
	}
	
	  public static boolean isPalindrome(String check) {
		  
		  String ters = "";
		  
		  for(int i = check.length()-1; i >= 0; i-- ) {
			  ters += check.substring(i, i+1);
		  }
		  
		 boolean isPalindrome = (check.replace(" ", "").equalsIgnoreCase(ters.replace(" ", ""))) ? true : false;
		  
		  return isPalindrome;
		  
	  }

	
}
