package com.String.easy;

import java.util.HashSet;
import java.util.Set;

public class PallindromePermutation {

	public static void main(String[] args) {
		String s = "aabb";
		boolean flag = pallindromePermutation(s);
		System.out.println(flag);

	}

	private static boolean pallindromePermutation(String s) {
		Set<Character> set = new HashSet<Character>();
		int count = 0;
		for(char ch : s.toCharArray()) {
			if(set.contains(ch)) {
				set.remove(ch);
				count++;
			}else {
				set.add(ch);
			}
		}
		
		
		if(s.length()%2==0) {
			if(s.length() == count*2) return true;
		}
		if(s.length()!= count*2 +1) {
			return false;
		}
		return true;
	}

}


