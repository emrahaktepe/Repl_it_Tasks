package Repl_it_Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _121_Arrays_PrintShortestWord_2 {

	/*
	 Write a program that will find out shortest
	 words in the given string str. If there are
	 few words that are evenly short, print them
	 all. Use split method in order to split str
	 string variable and create an array of strings. 
	 Print array with Arrays.toString() method.
	 Sort array before printing. 

		Split values by comma: split(", ");
		input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
		output: [cat, old, ray]
	 */
	
	
	
	public static void main(String[] args) {
		
//		String str = "olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
		
		String[] strArray = str.split(", ");
		
		int[] strLengthArray = new int[strArray.length];
		
		for(int i=0; i<strLengthArray.length; i++) {
			strLengthArray[i] = strArray[i].length();	
			}
		
		Arrays.sort(strLengthArray);
		
		int min = strLengthArray[0];

        ArrayList<String> minStrAL = new ArrayList<>();

        for(int i = 0; i < strArray.length; i++) {
            if (strArray[i].length() == min) {
                minStrAL.add(strArray[i]);
            }
        }
        Collections.sort(minStrAL);
        System.out.print(minStrAL);
    
		
}
}

