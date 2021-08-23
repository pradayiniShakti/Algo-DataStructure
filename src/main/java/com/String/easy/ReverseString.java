package com.String.easy;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String val = "Shak,ti";
		char[] s = {'a','b','c'};
		int num = 123;
		String result = reverseString.getReverse(val);
		System.out.println(result);
		
		char[] s1 = reverseString.getReverse1(s);
		System.out.println(Arrays.toString(s1));
		
		
		int result1 = reverseString.getRevNum(num);
		System.out.println(result1);

	}
private int getRevNum(int num) {
	int rev = 0;
		while(num>0) {
			int a = num%10;
			rev = rev*10 + a;
			num = num/10;
		}
		
		return rev;
	}
////String reverse
	private String getReverse(String val) {
		////// to check only alphanumeric character  val = val.replaceAll("[^A-Za-z0-9]","");
		String temp = "";
		char[] ch = val.toCharArray();
		for(int i = ch.length-1;i>=0; i--) {
			temp = temp + val.charAt(i);
		}
		return temp;
	}
	
	///Reverse vowel
	
	private char[] getReverse1(char[] s) {
		int i=0; int j = s.length-1;
		while(i<j) {
		char temp = s[i];
		s[i++]= s[j];
		s[j--]= temp;
		
		}
		return s;
	}

}
