package com.array.easy;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = {0,1,3};
		
		MissingNumber missingNumber = new MissingNumber();
		
		int result = missingNumber.getMissingNum(num);
		
		System.out.println("The missing number is "+result);
	}

	private int getMissingNum(int[] num) {
		Arrays.sort(num);
		
		if(num[0]!=0) {
			return 0;
		}
		
		for(int i=1; i<num.length; i++) {
			int missingNum = num[i-1]+1;
			if(missingNum!=num[i]) {
				return missingNum;
			}
		}
		
		return -1;
	}

}
