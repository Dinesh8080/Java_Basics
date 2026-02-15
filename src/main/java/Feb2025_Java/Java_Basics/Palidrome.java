package Feb2025_Java.Java_Basics;

public class Palidrome {

	public static void main(String[] args) {

int arr []  = {1,2,3,2,1}; // Define an Array 
		
boolean pl = true ; // Declair Booelan
		
int n = arr.length ; // Define a length 
		
for (int i=0,j = n-1; i<j ; i++ ,j-- ) // For loop 
      if (arr[i] != arr [j]) {
				pl = false ;
      }
		System.out.println(pl);
	  }
	  }


