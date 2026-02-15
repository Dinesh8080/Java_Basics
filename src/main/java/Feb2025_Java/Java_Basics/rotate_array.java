package Feb2025_Java.Java_Basics;

import java.util.Arrays;

public class rotate_array {
	

	public static void main(String[] args) {
		int ar [] = {1,2,3,4,5,6}; // Define an array 
		
		int n = ar.length ; // Define a length 
		
			
		
		for (int i=0,j = n-1; i<j;i++,j--) {
			
		int temp 	=ar[i]; //swap 
		ar [i]=ar[j];
		ar[j]=temp ;
		}
		System.out.println( Arrays.toString(ar));

	}
	
}
