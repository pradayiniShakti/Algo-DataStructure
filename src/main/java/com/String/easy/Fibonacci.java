package com.String.easy;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(Arrays.toString(getFibonacci(n)));

	}

	private static int[]  getFibonacci(int n) {
		int[] nums = new int[n];
		int num1 =0; 
		int num2 = 1;
		
		int count = 0;
		int j=0;
		
		while(count<n) {
			
			System.out.println(num1 + " ");
			nums[j++]=num1;
			int num3 = num1+ num2;
			num1= num2;
			num2= num3;
			count++;
			
		}
		return nums;
		
		
	}

}
