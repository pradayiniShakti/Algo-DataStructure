package arraysCode;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int[] nums = {0,1};
		int n = nums.length;
		
		int result = getMissingNumber(nums,n);
		System.out.println(result);
	}

	private static int getMissingNumber(int[] nums, int n) {
		Set<Integer> set = new HashSet<Integer>();
		for(int a : nums) {
			set.add(a);
		}
		
		for(int i =0; i<=n ; i++) {
			if(!set.contains(i)) {
				return i;
			}
		}
		
		return -1;
	}

}
