package Repl_it_Tasks;

import java.util.Scanner;

public class _080_OnlineBookMerchants {

	/*
	 Online Book Merchants offers premium customers
	 1 free book with every purchase of 5 or more
	 books and offers 2 free books with every purchase
	 of 8 or more books. It offers regular customers 1
	 free book with every purchase of 7 or more books,
	 and offers 2 free books with every purchase of 12
	 or more books. 

     Write a program that assigns freeBooks the appropriate
     value based on the values of the boolean variable
     isPremiumCustomer and the int variable nbooksPurchased.
     Print amount of freeBooks into the console. 
	 */
	
	public static void main(String[] args) {
		
		int freeBooks = 0;
	    Scanner scan = new Scanner(System.in);
	    boolean isPremiumCustomer = scan.nextBoolean();
	    int nbooksPurchased = scan.nextInt();
		int nFreeBooks = 0;
	if (isPremiumCustomer) {
		if(nbooksPurchased >= 8) {
			nFreeBooks = 2;
			System.out.println(nFreeBooks);
		}
		else if(nbooksPurchased >= 5 && nbooksPurchased < 8) {
			nFreeBooks = 1;
			System.out.println(nFreeBooks);
		}
		else {
			nFreeBooks = 0;
			System.out.println(nFreeBooks);
		}
	}
	else {
		if(nbooksPurchased >= 12) {
			nFreeBooks = 2;
			System.out.println(nFreeBooks);
		}
		else if(nbooksPurchased >= 7 && nbooksPurchased < 12) {
			nFreeBooks = 1;
			System.out.println(nFreeBooks);
		}
		else {
			nFreeBooks = 0;
			System.out.println(nFreeBooks);
	}
		
		
	}
	}	
}
