package DSA_14;

import java.util.HashMap;
import java.util.HashSet;

public class MasterStringCode {

	public static void main(String[] args) {

		// --------- Duplicate -----------------
		String str = "Curio rowleyanus, syn. Senecio rowleyanus, is a flowering plant in the daisy family Asteraceae.";

		HashSet<Character> set = new HashSet<>();
		for (char s : str.toCharArray()) {
			set.add(s);
		}
		System.out.println(set);
		// ------------------------longest ---------------------
		String longc = "The syntax for a \"for-each\" loop in a string varies significantly by programming language.";

		String word[] = longc.split("\\s");
		String longest = word[0]; // Declair empty array

		for (int i = 0; i < word.length; i++) {
			if (word[i].length() > longest.length()) {
				longest = word[i];
		}
		}
		System.out.println("longestWord:" + longest);
		StringBuilder sb = new StringBuilder(longc);

		int start = sb.indexOf(longest);
		int end = start + longest.length();
		sb.replace(start, end, "DINESHRAJE");
		System.out.println(sb);
		// -------------------------------------vowels and consonants----------------------------
		String str2 = longc;
		boolean found = false;
		HashMap<Character, Integer> map = new HashMap();
		for (char ch : str2.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			System.out.println(ch);
		}
		for (char ch : map.keySet()) {
			if (map.get(ch) > 1);
			System.out.println(ch);
		}
		for (char ch : str2.toCharArray()) {
			if (ch == 'a' || ch == 'I' || ch == 'O' || ch == 'E' || ch == 'U' || ch == 'H');
			found = true;
		}
		if (found) {
			System.out.println("Vowels are there :" + found);
		}
		else {
			System.out.println("Notfound");
		}
		// --------------------------------------------Palidrome----------------------------
		String str3 = str2;
		boolean isPalindrome = true; // assume true, disprove it

		int left = 0;
		int right = str3.length() - 1;

		while (left < right) {
			if (str3.charAt(left) != str3.charAt(right)) {
				isPalindrome = false; // mismatch found
				break;
		}
			left++;
			right--;
		}
		if (isPalindrome) {
			System.out.println("isPalindrome: true");
		} else {
			System.out.println("isPalindrome: false");
		}
	}
}
