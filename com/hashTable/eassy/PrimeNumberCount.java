package com.hashTable.eassy;

public class PrimeNumberCount {
	
	static int n=10;
	static boolean[] dp = new boolean[n];

	public static void main(String[] args) {
		
		
		int result = getPrimeCount(n);
		System.out.println(result);

	}

	public static int getPrimeCount(int n) {
		if(n < 2 ) return 0;
		
		int count = 0;
		for(int i = 2; i < n; i++ ) {
		{	if(dp[i]==false) 
	            count++;
				markAllTrue(i);
			}
		}
		return count;
	}
	
	static void markAllTrue(int n) {
		//int i = 2; 
		//while(i*n < dp.length) {
			
		for(int i=2; i*n < dp.length;i++) {
		dp[i*n] = true;
			
		}
	} 

}
