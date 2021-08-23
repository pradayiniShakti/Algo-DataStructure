package com.String.easy;

import java.util.HashMap;

public class Anagram {
////check if the character in String 1 is same in string 2 despite of the order
	public static void main(String[] args) {
		String m = "SShaktis";
		String n ="sihaktSS";
		Anagram a = new Anagram();
		System.out.println(a.isAnagram(m,n));
		
	}

private boolean isAnagram(String m, String n) {
	HashMap<Character,Integer> m1 = new HashMap<Character,Integer>();
	HashMap<Character,Integer> m2 = new HashMap<Character,Integer>();
	if(m.length()!= n.length()) return false;
	for(int i =0; i< m.length(); i++) {
		m1.put(m.charAt(i), m1.getOrDefault(m.charAt(i), 0)+1);
		m2.put(n.charAt(i), m2.getOrDefault(n.charAt(i), 0)+1);
	}
	return m1.equals(m2);
}

	

}
