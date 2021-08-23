package arraysCode;

public class MaximumSubarray {

	public static void main(String[] args) {
		MaximumSubarray maximumSubarray = new MaximumSubarray();
		int[] num = {-2,1,-3,4,-1,2,1,-5,4};
		int result = maximumSubarray.getMaxSum(num);
		System.out.println(result);

	}

	private int getMaxSum(int[] num) {
		int minSum = num[0];
		int maxSum = num[0];
		
		for(int i =1; i< num.length;i++) {
			minSum = Math.max(minSum+num[i], num[i]);
			maxSum = Math.max(maxSum, minSum);
		}
		return maxSum;
	}

}
