package Repl_it_Tasks;

public class _158_MethodsWithReturn_IsEven {

	/*
		isEven method gets a number(int)
		if its even (2,4,8...) returns true.
		if its odd return false.
		
		for example:
		
		isEven(1) --> false
		
		isEven(8) --> true
	 */

	
	public static void main(String[] args) {
	
		System.out.println(isEven(6));
		
		
	}
	
	public static boolean isEven(int n){
	  boolean result = (n%2==0) ? true : false;
	    return result;
	  }
	
}
