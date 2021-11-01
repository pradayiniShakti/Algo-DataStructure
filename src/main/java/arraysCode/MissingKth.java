package arraysCode;

public class MissingKth {
	/*
	 * Given an array arr of positive integers sorted in a strictly increasing
	 * order, and an integer k.
	 * 
	 * Find the kth positive integer that is missing from this array. Input: arr =
	 * [2,3,4,7,11], k = 5 Output: 9 Explanation: The missing positive integers are
	 * [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
	 */

	public static void main(String[] args) {
		int[] nums = {2,3,4,7,11};
		int k = 5;
		int result = missingKthNumber(nums,5);
		System.out.println(result);

	}

	private static int missingKthNumber(int[] nums, int k) {
		int left = 0, right = nums.length -1;
		while(left<=right) {
			int pivot = left + (right-left)/2;
			if(nums[pivot]-pivot-1<k) {
				left = pivot +1;
			}else {
				right = pivot - 1;
			}
		}
		return left + k;
	}

}
