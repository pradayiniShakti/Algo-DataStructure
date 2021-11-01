package com.String.easy;

public class Subsequence {

	public static void main(String[] args) {
		String s = "abc";
		String t = "ahgdc";
		boolean flag = isSubsequence(s,t);
		System.out.println(flag);
	}

	private static boolean isSubsequence(String s, String t) {
		int m = s.length();
		
		int n = t.length();
		
		int i =0;
		int j=0;
		while(i<m && j<n) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
			}
			j++;
		}
		
		return i==m;
	}

}
