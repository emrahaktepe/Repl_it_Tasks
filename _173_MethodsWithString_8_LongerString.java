package Repl_it_Tasks;

public class _173_MethodsWithString_8_LongerString {

	/*
	  the method gets two strings and return the longest one

			biggerS("apple","orange") ==> "orange"
	 */
	
	public static void main(String[] args) {
		
		String biggerS = biggerS("twothousand", "nineteen");
		System.out.println(biggerS);
		
	}
	
	  public static String biggerS(String a ,String b) {
	
	  String longer = (a.length() > b.length()) ? a : b;
	  
	  return longer;
	  } 
}
