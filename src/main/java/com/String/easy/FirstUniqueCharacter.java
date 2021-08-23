package com.String.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstUniqueCharacter {

	public static void main(String[] args) {
		String str = "eeetcode";
		int index = getUniqueCharIndex(str);
		System.out.println(index);
		

	}

	private static int getUniqueCharIndex(String str) {
char[] ch = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		int count = 0;
		for(char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		/*
		 * Set<Character> set = new HashSet<Character>(); //Entry<Character,Integer>
		 * entry = map.entrySet(); for(Map.Entry<Character,Integer> entry:
		 * map.entrySet()) { if(entry.getValue()==1) { set.add(entry.getKey()); } }
		 */
		
		for(int i =0; i< str.length(); i++) {
			if(map.get(str.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}

}
