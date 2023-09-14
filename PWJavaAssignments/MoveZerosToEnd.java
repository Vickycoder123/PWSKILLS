package random;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 3, 12 };
		moveZerosToEnd(a);
		System.out.println(Arrays.toString(a));
	}

	private static void moveZerosToEnd(int[] nums) {
		int left = 0; // Left pointer
		int right = 0; // Right pointer

		while (right < nums.length) {
			if (nums[right] != 0) {
				// Swap non-zero element with left pointer
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;

				left++; // Move left pointer forward
			}
			right++; // Move right pointer forward
		}
	}
}
