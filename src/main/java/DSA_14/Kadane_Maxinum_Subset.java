package DSA_14;


public class Kadane_Maxinum_Subset {
    public static int Kadane_Maxinum_SubsetMethod(int ar[]) {

        int cur = ar[0];
        int max = ar[0];

        for (int i = 1; i < ar.length; i++) {

            cur = Math.max(ar[i], cur + ar[i]); // incrment as one 
            max = Math.max(max, cur);
        }

        return max;
    }

    public static void main(String[] args) {

        int ar[] = { 2, 4, 5, -7, 8 };

        int result = Kadane_Maxinum_SubsetMethod(ar);

        System.out.println("Maximum Subarray Sum = " + result);
    }
}
