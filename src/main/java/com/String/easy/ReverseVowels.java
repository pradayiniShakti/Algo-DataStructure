package com.String.easy;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowels {

	public static void main(String[] args) {
		String s = "hellO";
		String result = getReverse(s);
		System.out.println(result);

	}

	private static String getReverse(String s) {
		List<Character> li = new ArrayList<Character>();
		char[] c = s.toCharArray();
		li.add('a');
		li.add('e');
		li.add('i');
		li.add('o');
		li.add('u');
		int i = 0;
		int j = s.length() -1;
		while(i<j) {
			while(!li.contains(Character.toLowerCase(c[i])) && i<j) {
				i++;
			}
			while(!li.contains(Character.toLowerCase(c[j])) && i<j) {
				j--;
			}
			
			if(li.contains(Character.toLowerCase(c[i]))) {
				char temp = c[i];
				c[i++] = c[j];
				c[j--] = temp;
			}
			
			
		}
		
		return String.valueOf(c);
	}

}
