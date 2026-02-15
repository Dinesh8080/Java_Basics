package DSA_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Subset {
	public static List<List<Integer>> subsetMethod(int ar[], List<List<Integer>> res) {
 		Arrays.sort(ar); // sort to handle duplicates
		res.add(new ArrayList<>()); // empty subset
		for (int l : ar) { // iterate 
			int size = res.size(); 
			System.out.println(size);
			for (int i = 0; i < size; i++) { // 
				List<Integer> temp = new ArrayList<>(res.get(i)); // FIXED
				temp.add(l);
				res.add(temp);
			}
		}
		return res;
	}
	
	
		public static void main(String[] args) {
		int ar[] = { 0, 2, 1,1};
		ArrayList<List<Integer>> res = new ArrayList<>();
		List<List<Integer>> k = subsetMethod(ar, res);
		System.out.println(k);
		
	}
}
	
		
		
		
		
		
		
		
