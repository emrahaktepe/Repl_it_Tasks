package Repl_it_Tasks;

import java.util.Scanner;

public class _155_Methods_17_FibonacciNumbers {

	/*
	 	Complete a method fib() that will compute Fibonacci numbers
		In fibonacci series, next number is the sum of previous 
		two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……... 
		The first two numbers of fibonacci series are 0 and 1.
		Given a number num, print n-th Fibonacci Number.
		
		Input  : 2
		Output : 1
		
		Input  : 9
		Output : 21
	 */
	
	  public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    int num = scan.nextInt();
				System.out.println(fib(num));
		  }
		  
		  public static int fib(int num){
				if(num<=1) {
					return num;
				}
				return fib(num-1) + fib(num-2);
		  }
		}
