package Repl_it_Tasks;

public class _171_MethodsWithString_6_LimitString {

	/*
	This method gets a string and an int, and it returns a string.

	It limits the string input to a certain number of characters.
	
	for example:
	
	limit("abcd",2)
	returns "ab"
	
	limit("bla bla",3)
	returns "bla"
	
	hint:
	
	https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#substring(int)
	 */
	
	public static void main(String[] args) {
		
		String result = limits("bla bla", 3);
		System.out.println(result);
	}
	
	
	public static String limits(String text, int lengthX) {
		
		text = text.substring(0, lengthX);
		
		return text;
	}
}
