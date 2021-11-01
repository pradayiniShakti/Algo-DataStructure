package com.String.easy;

import java.util.HashSet;
import java.util.Set;

/*A number is happy if 
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1*/

public class HappyNumber {

	public static void main(String[] args) {
		int num = 19;
		getIsHappy(num);
		System.out.println(getIsHappy(num));
	}

	private static boolean getIsHappy(int num) {
		Set<Integer> set = new HashSet<Integer>();
		while(num!=0 && !set.contains(num)) {
			set.add(num);
			num = getSum(num);
			
		}
		return num==1;
		
	}

	private static int getSum(int num) {
		int sum = 0;
		while(num>0) {
			int a = num%10;
			num = num/10;
			sum = sum+ a*a;
		}
		return sum;
	}

}
