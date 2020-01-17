package Repl_it_Tasks;

public class _189_MethodsWithString_13_FindErrorString {

	/*
	 	isError method checks if the line of string it gets
	 	has the word error at the start of it.

		it gets a string and returns a boolean.
		true if it found the word 'error' an the start of the line string
		
		example use:
		
		isError("foo bar")
		returns : false
		
		isError("error foo bar")
		returns : true
		
		isError("error one two")
		returns : true
		
		isError("three four error")
		returns : false
	 */
	
	public static boolean isError(String line) {
		
		boolean result = (line.startsWith("error")) ? true : false;
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		String line = "error menemen deneme";
		
		System.out.println(isError(line));
		
	}
	
}
