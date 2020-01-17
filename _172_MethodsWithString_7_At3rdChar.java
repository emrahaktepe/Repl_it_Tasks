package Repl_it_Tasks;

public class _172_MethodsWithString_7_At3rdChar {

	/*
		at3 gets two strings and returns a string.
		
		the first string is the one that will be manipulated.
		at the 3rd char position of target you will insert
		the word argument.
		
		example use:
		
		at3("longword","foo")
		will return: "lonfoogword"
		
		at3("blabla","a")
		will return: "blaabla"

	 */
	
	public static void main(String[] args) {
		
		
		String result = at3("karanfil", "zzz");
		
		System.out.println(result);
	}
	
	public static String at3(String text, String second) {
		
		String result = text.substring(0, 3)+second+text.substring(3, text.length());
		
		return result;
	}
}
