package com.String.easy;

public class ClimbingStairs {

	public static void main(String[] args) {
		int n = 5;
		int result = getTotalWays(n);
		System.out.println(result);

	}

	private static int getTotalWays(int n) {
		int first = 1;
		int second = 2;
		
		if(n==1) return 1;
		for(int i=3; i<=n; i++) {
			int third = first + second;
			first = second;
			second = third;
			
		}
		return second;
	}

}
