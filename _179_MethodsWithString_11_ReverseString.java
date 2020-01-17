package Repl_it_Tasks;

public class _179_MethodsWithString_11_ReverseString {

	
	/*
	 reverse method reverses a string.
		it gets a string and returns it in reverse.
		
		for example:
		
		reverse("foo") ==> "oof"
		
		reverse("student") ==> "tneduts"
	 */
	
	public static void main(String[] args) {
		
		String reversal = reverse("menemen");
		System.out.println(reversal);
	}
	
	public static String reverse(String input) {
		String result = "";
		for(int i = input.length()-1; i >= 0; i--) {
			result += input.substring(i, i+1);
		}
		return result;

	}

	
}
