package random;

import java.util.HashMap;

public class FirstUniqueCharacter {
	public static void main(String[] args) {
		String s = "leetcode";
		int index = firstUniqChar(s);
		System.out.println("First Unique Character index");
		System.out.println(index);
	}

	private static int firstUniqChar(String s) {
		HashMap<Character, Integer> charFrequency = new HashMap<>();

		// add characters to hashmap with frequency
		for (char c : s.toCharArray()) {
			charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
		}

		// Find the first character with frequency 1
		for (int i = 0; i < s.length(); i++) {
			if (charFrequency.get(s.charAt(i)) == 1) {
				return i;
			}
		}

		// if no repeating character found
		return -1;
	}
}
