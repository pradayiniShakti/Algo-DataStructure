package arraysCode;
/// its a index at which the sum of numbers before the index is same as sum of number after that.
public class PivotIndex {
private static int leftSum;
	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		int index = getPivotIndex(nums);
		System.out.println(index);

	}

	private static int getPivotIndex(int[] nums) {
		leftSum = 0;
		int totalSum = 0;
		int i=0;
		for(int a : nums) {
			totalSum = totalSum + a; 
		}
		for(int b : nums) {
			if(leftSum == totalSum - b -leftSum) {
				return i;
			}else {
				leftSum = leftSum + b;
			}
			i++;
			
		}
		
		return i;
	}

}
