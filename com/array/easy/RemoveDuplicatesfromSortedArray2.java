package com.array.easy;
import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray2 {
	
	private static int[] nums = {1,2,2,3,4,4,5};

	public static void main(String args[]) {
		
		RemoveDuplicatesfromSortedArray2 removeDuplicatesfromSortedArray2 =  new RemoveDuplicatesfromSortedArray2();
		int result = removeDuplicatesfromSortedArray2.removeDuplicate(nums);
		System.out.println("The lenght of sorted array is"+ result);
		
		int[] result2 = Arrays.copyOfRange(nums, 0, result);
		System.out.println("The array element after removing duplicates "+ Arrays.toString(result2));
		}

	private int removeDuplicate(int[] nums2) {
		
		int i =0;
		for(int j=0; j< nums2.length ; j++) {
			if(nums2[i]!=nums2[j]) {
				i++;
				nums2[i]=nums2[j];
			}
		}
		return i+1;
	}
}
