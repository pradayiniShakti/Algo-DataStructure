package com.String.easy;

public class ReverseNumber {

	public static void main(String[] args) {
		long n = -123;
		long rev =0;
		while(Math.abs(n)!=0) {
			if(Math.abs(n)>Integer.MAX_VALUE) rev= 0;
			long a = n%10;
			rev = rev*10+ a;
			n = n/10;
			
		}
		System.out.println(rev);
	}

}
