package arraysCode;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int[] nums = { 4, 5, 3, 8, 7 };
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));

	}

}
