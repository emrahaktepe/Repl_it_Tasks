package Repl_it_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class _117_Arrays_CopyCertainValues {

	/*
	 Given a String array arr with the following elements
		["zero", "one", "two","three","four"]
		
		Create another array fewValues and copy words that have letter "e" in them
		
		You need to know how many element contain "e" and create array accordingly
		
		Values in fewValues array need to be["zero", "one","three"]
		
		Examples:
		arr -> ["aa", "be", "lol", "lel", "oreo"] 
		fewValues -> ["be",  "lel", "oreo"] 
		
		arr -> ["e", "hey", "bye", "furey", "spoon"] 
		fewValues ->["e", "hey", "bye", "furey"] 
	 */
	
	  public static void main(String[] args) {
		    System.out.println("-----EXAMPLE RUN ---------");
		    String[] numbers = {"zero", "one", "two","three","four"};
		    System.out.println(Arrays.toString(getWithE(numbers)));
		    
		  }
		  
		  public static String[] getWithE(String[] arr) {
		    
		    //TODO : YOUR CODE GOES HERE ----------------------
		    
			 ArrayList<String> fewValues = new ArrayList<>();
			 for(int i=0; i<arr.length; i++) {
			    	if(arr[i].contains("e")) {
			    		fewValues.add(arr[i]);
			    	}
			 }
			  
//			 String[] arr2 = new String[arr.length];
//		    int j = 0;
//			 for(int i=0; i<arr.length; i++) {
//		    	if(arr[i].contains("e")) {
//		    		arr2[j] = arr[i];
//		    		j++;
//		    	}
//		    }
//			
//			String[] fewValues = new String[j];
//			for(int i=0; i<j; i++) {
//				fewValues[i] = arr2[i];
//			}
			  
		    
		    
		    //YOUR CODE ENDS HERE -----------------------
			 Object[] gfg= fewValues.toArray();
					 String[] str = Arrays.copyOf(gfg, 
					                              gfg.length, 
					                              String[].class);
		    return str;
		    
	
}
}