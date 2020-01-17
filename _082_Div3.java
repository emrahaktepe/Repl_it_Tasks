package Repl_it_Tasks;

public class _082_Div3 {

	/*
	 * Write for and while loops to print the numbers from 1 to 20 that are
	 * divisible by 3. Expected Output: 3 6 9 12 15 18
	 */

	public static void main(String[] args) {

		for (int i = 1; i <= 20; i++)
			if (i % 3 == 0)
				System.out.print(i + " ");

		System.out.println();
		
		int k = 1;
		while (k < 20) {
			k++;
			if (k % 3 == 0)
				System.out.print(k+" ");
		}
	}
}
