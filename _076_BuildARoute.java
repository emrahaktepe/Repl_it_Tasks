package Repl_it_Tasks;

	import java.util.Scanner;
	
	public class _076_BuildARoute {

		/*
		 Write a program that will print out route instructions.
		 Your program should take 2 parameters: start point and
		 end point. Use left, right, up and down for navigation.
		 Insert ">" between commands. If start point equals to
		 end point - display: "start/end(start or end variable!)
		 found".
				Note: you may move only clock wise.
		 */
		
	  public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String start = scan.next();
	    String end = scan.next();
//	    String route = "";
//	    
//	    
//	      
//	    
//	      for (int i=0; i<4; i++) {
//	        
//	        if (start.equals(end)){
//	          if (i!=0){
//	            route = route.substring(0,route.length()-3);
//	            System.out.println(route + ": " + start + " found");
//	          } else {
//	            System.out.println(route + start + " found");
//	          }
////	          break;
//	        } 
//	        
//	        if (start.equals("A")){
//	          route = route + "right";
//	          start = "B";
//	        } else if (start.equals("B")){
//	          route = route + "down";
//	          start = "C";
//	        } else if (start.equals("C")){
//	          route = route + "left";
//	          start = "D";
//	        } else {
//	          route = route + "up";
//	          start = "A";
//	        }
//	        route = route + " > ";
//	        
//	      }
	    
	   
	      
	      
	      
//	      String route= "";
//	      
//	      if(start.equals(end)){
//	          route = start + " found";
//	      }
//	      else{
//	          route = "Aright > Bdown > Cleft > Dup > Aright > Bdown > Cleft";
//	          if(route.indexOf(start)>route.indexOf(end)){
//	              route = route.substring(route.indexOf(start),route.lastIndexOf(end)-3);
//	          }else{
//	              route = route.substring(route.indexOf(start),route.indexOf(end)-3);
//	          }
//	          route = route.replace("A","");
//	          route = route.replace("B","");
//	          route = route.replace("C","");
//	          route = route.replace("D","");
//	          route += ": " + end + " found";
//	      }
//	      System.out.println(route);
//	      
	      
	      
	      
	      
	    
//	     NON WORKING TRY
	      if(start.equals("A")){
	    	if(end.equals("D")) {
	    		System.out.println("right > down > left: " + end + " found");
	    	}
	    	else if(end.equals("C")) {
	    		System.out.println("right > down: " + end + " found");
	    	}
	    	else if (end.equals("B")){
	    		System.out.println("right: " + end + " found");	
	    	}
	    	else{
	    		System.out.println(end + " found");
	    	}
	    }
	    
	      else if(start.equals("B")) {
	    	if(end.equals("A")) {
	    		System.out.println("down > left > up: " + end + " found");
	    	}
	    	else if(end.equals("D")) {
	    		System.out.println("down > left: " + end + " found");
	    	}
	    	else if (end.equals("C")) {
	    		System.out.println("down: " + end + " found");	
	    	}
	    	else {
	    		System.out.println(end + " found");
	    	}
	    }
	    
	    else if(start.equals("C")) {
	    	if(end.equals("B")) {
	    		System.out.println("left > up > right: " + end + " found");
	    	}
	    	else if(end.equals("A")) {
	    		System.out.println("left > up: " + end + " found");
	    	}
	    	else if (end.equals("D")) {
	    		System.out.println("left: " + end + " found");	
	    	}
	    	else {
	    		System.out.println(end + " found");
	    	}
	    }
	    
	    else {
	    	if(end.contentEquals("C")) {
	    		System.out.println("up > right > down: " + end + " found");
	    	}
	    	else if(end.equals("B")) {
	    		System.out.println("up > right: " + end + " found");
	    	}
	    	else if (end.equals("A")) {
	    		System.out.println("up: " + end + " found");	
	    	}
	    	else {
	    		System.out.println(end + " found");
	    	}
	    }
	      
	      
	      
	      
	    
	    
}
}