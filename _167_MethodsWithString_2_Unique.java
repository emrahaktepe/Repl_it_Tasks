package Repl_it_Tasks;

public class _167_MethodsWithString_2_Unique {

	/*
	 uniqueChars is a method that you will code now,
	 should be able to accept any string in the world
	 and return unique characters from the parameter.

		Examples:		
		uniqueChars("java") ==> "jav"		
		uniqueChars("mama") ==> "ma"		
		uniqueChars("spoon") ==> "spon"
	 */
	
	public static void main(String[] args) {
		
	    System.out.println( uniqueChars("wooden-spoon") ) ;
		
	}
	
	
	public static String uniqueChars(String str) {
		  
		  String unq = "";
		  for(int i=0; i<str.length(); i++) {
			  if(!unq.contains(str.substring(i, i+1))) {
				  unq += str.substring(i, i+1);
			  }
		  }
		  return unq;
		  
	  }

}
