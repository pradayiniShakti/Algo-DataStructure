package com.String.easy;

public class FibonacciSum {

	public static void main(String[] args) {
		int n =5;
		
		int result = getFibbo(n);
System.out.println(result);
	}

	private static int getFibbo(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 =0;
		
		if(n<2) {
			return n;
		}
		for(int i =2 ; i<=n; i++) {
			n3 = n1 + n2;
			n1= n2;
			n2= n3;
		}
		return n3;
	}

}
