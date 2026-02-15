package DSA;

import java.util.HashMap;

public class WindowSlidingVariable {

public static void main(String[]args) {
        String s = "DineshDeshmukh";
        System.out.println(longestUniqueSubstring(s));}

    public static int longestUniqueSubstring(String S) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int best = 0;

        for (int right = 0; right < S.length(); right++) {

            char ch = S.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            // shrink window if duplicate found
            while (map.get(ch) > 1) {
                char remove = S.charAt(left);
                map.put(remove, map.get(remove) - 1);
                left++;
            }

            // update best window
            best = Math.max(best, right - left + 1);
        }

        return best;
    }
}
