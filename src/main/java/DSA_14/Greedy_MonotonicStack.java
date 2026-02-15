package DSA_14;

import java.util.Arrays;
import java.util.Stack;

public class Greedy_MonotonicStack {

	
	public static Stack<Integer> removeK(int ar [],int k ) {
		Arrays.sort(ar);
		Stack<Integer> stack = new Stack<Integer>();
		for (int m : ar) {
			   while (!stack.isEmpty() && k > 0 && stack.peek() > m) {
	                stack.pop();
	                k--;
			}
			   stack.push(m)
;		}
		return stack ;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int ar[]= {1,2,5,6,7,8};
		int k =3;
		Stack<Integer> t =removeK(ar, k);
		
		System.out.println(removeK(ar, k));

	}

}
