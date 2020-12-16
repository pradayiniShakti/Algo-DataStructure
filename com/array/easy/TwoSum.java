package com.array.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] num = {2,3,6,5};
		int target = 5;
		TwoSum twoSum = new TwoSum();
		
		int[] resultIndices = twoSum.getSum(num, target);
		
		System.out.println("The result is "+Arrays.toString(resultIndices));
		

	}

	private int[] getSum(int[] num, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		
		for(int i =0; i<num.length;i++) {
			int component = target - num[i];
			
			if(map.containsKey(component)) {
				
				return new int[] {map.get(component), i};
			}
			map.put(num[i], i);
		}
		
		throw new IllegalArgumentException("Required number is not found");
		
	}

}
