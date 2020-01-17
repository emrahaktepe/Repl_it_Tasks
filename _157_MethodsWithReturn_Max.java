package Repl_it_Tasks;

public class _157_MethodsWithReturn_Max {

	/*
	 max function gets two ints, x and max.
		x is the test case, max is what we test against.
		
		if  x is bigger then max return max
		in any other case return x.
		
		for example:
		
		max(1,10)
		returns 1
		
		max(11,5)
		returns 5
	 */
	
	public static void main(String[] args) {
		
	System.out.println(max(11, 5));
	
}
	public static int max(int x, int max){
	  
		int result = (x>max) ? max : x;
		
	    
		return result;
	  }
	
}
