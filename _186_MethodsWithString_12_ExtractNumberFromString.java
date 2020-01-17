package Repl_it_Tasks;

public class _186_MethodsWithString_12_ExtractNumberFromString {

	/*
	 		extractNum

			description:
			a method that cleans any non number string from a string it gets
			and returns the clean string
			input:
			-s (string)- a string the method gets
			return: string: a string of numbers only
			
			example use:
			
			extractNum("aa2aa3") ==> 23
			
			extractNum("aa2") ==> 2
			
			extractNum("aa10aa") ==> 10
			
			extractNum("aa!!%$#.10aa") ==> 10
			
			
			hint:
			you can use:
			 Character.isDigit(ch)
			 or conditions
	 */
	
	  public static String extractNum(String something) {
		  
		  String reference = "0123456789";
			
			String numsInTheString = "";
			for(int i = 0; i < something.length(); i++) {
				if(reference.contains(""+something.charAt(i))) {
					numsInTheString += something.charAt(i);
				}
			}
			return numsInTheString;
		  
	  }

	
	
	public static void main(String[] args) {
		
		String something = "de34n7e2m4";
		
		System.out.println(extractNum(something));
		
		
	}
	
}
