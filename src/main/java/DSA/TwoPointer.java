package DSA;

public class TwoPointer {

	public static boolean Twopointer(int ar[], int target) {

		int left = 0;
		int right = ar.length - 1;
		while (left < right) {
			int sum = ar [left ]+ar [right];
			
			if (sum ==target)
				return true;
			
			if (sum <target ) left++;
			else right--;
	
					}
		return false ;

	}

	public static void main(String[] args) {

		int ar[] = { 1, 2, 3, 4, 5 };
		int target = 9;
		boolean k =Twopointer(ar, target);
System.out.println(k);
	}
}
