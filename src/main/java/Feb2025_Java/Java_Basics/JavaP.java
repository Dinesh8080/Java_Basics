package Feb2025_Java.Java_Basics;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaP {

	
	    public static void main(String[] args, String conact) {
//	        String s1 = "This is a test. This test is just a test.";
//	        // Normalize and split on non-letter characters
//	        String[] words = s1.toLowerCase().split("[^a-z]+");
//
//	        Set<String> seen = new HashSet<>();
//	        Set<String> duplicates = new LinkedHashSet<>();
//	        StringBuilder sb = new StringBuilder();
//
//	        for (String w : words) {
//	            if (w.isEmpty()) continue;
//	            if (!seen.add(w)) {
//	                // First time we detect this duplicate, add to duplicates set
//	                duplicates.add(w);
//	            }
//	        }
//
//	        // Collect duplicates into StringBuilder
//	        for (String dup : duplicates) {
//	            if (sb.length() > 0) sb.append(", ");
//	            sb.append(dup);
//	        }
//
//	        String result = sb.toString();
//	        System.out.println("Duplicate words: " + (result.isEmpty() ? "None" : result));
	    	

	    
	    	        String s1 = "summer";
	    	        System.out.println(conact + s1 );
	    	        String s2 = "winter";

	    	        // 1. Direct concatenation in println
	    	       
	    	        // Output: Direct concat: summerwinter

	    	        // 2. Use StringBuilder to append s2
	    	        StringBuilder sb = new StringBuilder();
	    	        sb.append(s2);            // append "winter"
	    	        sb.append(" season");     // optional addition to demonstrate chaining
	    	        String result = sb.toString();

	    	        System.out.println("Using StringBuilder: " + result);
	    	        // Output: Using StringBuilder: winter season
	    	    }
	    	
	    
	    
	    
	    
	    
	    }		
		
		
	


