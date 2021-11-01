package com.array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] nums = {1,4,4,3,5,2,6};
		ContainsDuplicate containsDuplicate =  new ContainsDuplicate();
		boolean flag = containsDuplicate.hasDuplicate1(nums);
System.out.println(flag);
	}
	@SuppressWarnings("unused")
	private boolean hasDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i=0; i< nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				return true;
			}
		}
		return false;
	}
	

	private boolean hasDuplicate1(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int a: nums) {
			if(set.contains(a)) {
				return true;}
				else {
					set.add(a);
				}
			
		}
		return false;
	
	}

}
