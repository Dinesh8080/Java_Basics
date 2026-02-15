package DSA;

import java.util.Arrays;

public class SortArray {
	
	public static int[] sortarray(int[] ar, int[] k) {
		
		Arrays.sort( ar );
		k= ar;
		
		return  k ;
		
	}
	

	public static void main(String[] args) {
		
		
		
		int ar []= {5,4,2,3,1,0};
		int k[]= {};
		int[] m=sortarray(ar,k);
		
		System.out.println(Arrays.toString(m));

	}

}
