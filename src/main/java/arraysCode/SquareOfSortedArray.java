package arraysCode;

import java.util.Arrays;

public class SquareOfSortedArray {

	public static void main(String[] args) {
		int[] nums = {-4,-1,0,3,10};
		int[] result = squareSort(nums);
		System.out.println(Arrays.toString(result));

	}

	private static int[] squareSort(int[] nums) {
	int[] ssum = new int[nums.length];
	int i =0;
	for(int a : nums) {
		ssum[i++] = Math.abs(a*a);
	}
	Arrays.sort(ssum);
		return ssum;
	}

}
