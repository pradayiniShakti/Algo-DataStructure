package com.array.easy;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
	
	private static int[] array = {1,1,1,1,2,3,4};
	
	public int removeDuplicates(int[] nums) {
		if(nums.length ==0) {
			return 0;
		}
		int i=0;
		for(int j=1;j<nums.length; j++) {
			if(nums[i]!=nums[j]) {
				i++;
				nums[i]= nums[j];
			}
		}
		return i+1;
	}

	public static void main(String[] args) {
		
		RemoveDuplicatesfromSortedArray obj = new RemoveDuplicatesfromSortedArray();
		
		int result = obj.removeDuplicates(array);
		
		System.out.println(result);
		
		int[] result1 = Arrays.copyOfRange(array, 0, result);
		
		System.out.println(Arrays.toString(result1));
		
		
		

	}

}
