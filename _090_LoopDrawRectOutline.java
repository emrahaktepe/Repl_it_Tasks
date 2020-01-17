package Repl_it_Tasks;

import java.util.Scanner;

public class _090_LoopDrawRectOutline {

	 public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    
//	    String rectangle ="xxx\n";
//	    for(int i=1; i<=n;i++)
//	    {
//	       rectangle +="x x\n";
//	    }
//	    rectangle +="xxx";
//	    System.out.println(rectangle);	
	
	String square = "__________\n";
	for ( int i = 1; i<=n; i++) {
		square +="|        |\n";
	}
		square += "__________";
		System.out.println(square);
}
}