package Repl_it_Tasks;

public class _143_Methods_5_SimplePrintPattern {

	/*
	  	Create a method printHollowRect that prints a 5 on 5 hollow rectangle:
 
			*****
			*   *
			*   *
			*   *
			*****

		hint:you will need to use two nested for loops for that,
		and an if that checks if its the last or first iteration 
		of the loop (so you will know when to print "*" or " ")
	 */
	
	public static void main(String[] args) {
		
		printHollowRect();
		
	}
	
	public static void printHollowRect() {
		
		String fiveStar = "*****";
		String twoStar = "*   *";
		System.out.println(fiveStar);
		for(int i = 0; i < fiveStar.length()-2; i++) {
			System.out.println(twoStar);
		}
		System.out.println(fiveStar);

	}
}
