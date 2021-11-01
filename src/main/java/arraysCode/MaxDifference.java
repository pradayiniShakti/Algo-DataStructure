package arraysCode;

public class MaxDifference {

	public static void main(String[] args) {
		int[] nums = {1,2,4,4,5,8};
		int result = getIndex(nums);
		System.out.println(result);
	}

	private static int getIndex(int[] nums) {
		
		int i = 0;
		int maxDiff =0;
		for(int j=1; j< nums.length; j++) {
			int maxDiff1 = nums[j]- nums[i];
			maxDiff = Math.max(maxDiff, maxDiff1);
			i++;
		}
		return maxDiff;
	}

}
