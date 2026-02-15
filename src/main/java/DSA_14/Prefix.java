package DSA_14;

import java.util.Arrays;

public class Prefix {

    public static int[] PrefixMthod(int ar[], int pre[]) {

        // First element directly copy
        pre[0] = ar[0];

        // Start loop from 1
        for (int i = 1; i < ar.length; i++) {
            pre[i] = pre[i - 1] + ar[i];
        }

        // Print prefix array
        for (int n : pre) {
            System.out.print(n + " ");
        }

        return pre;
    }

    public static void main(String[] args) {

        int ar[] = {2, 3, 5, 6};
        int pre[] = new int[ar.length];

        System.out.println("\nUsing Arrays.toString:");
        System.out.println(Arrays.toString(PrefixMthod(ar, pre)));
    }
}