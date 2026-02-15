package DSA_14;
import java.util.Arrays;
import java.util.PriorityQueue;
public class TopKElement { // Maximum subset 

	public static PriorityQueue<Integer> TopKElementMethod(int ar[], int k) {
		Arrays.sort(ar);
		PriorityQueue<Integer> pq = new PriorityQueue<>(); // we can insert as per requirement
		for (int d : ar) {
			pq.add(d);
			if (pq.size() > k) {
			pq.poll();
		}}
		return pq;
	}
	public static PriorityQueue<Integer> SmallKElementMethod(int ar[], int k) {
		Arrays.sort(ar);
		PriorityQueue<Integer> pm = new PriorityQueue<Integer>();
		for (int r : ar) {
			pm.add(r);
			if (pm.size() < k){
			pm.poll();
		}}
		return pm;
	}
	public static void main(String[] args) {
		int ar[] = { 2, 4, 6, 7, 4, 3, 3, 4 };
		int k = 3;
		PriorityQueue<Integer> D1 = TopKElementMethod(ar, k);
		System.out.println("largest k of subset "+ D1);
		PriorityQueue<Integer> D = SmallKElementMethod(ar, k);
		System.out.println("Smallest k of subset "+ D);
	}

}
