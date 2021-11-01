package com.String.easy;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
////check if the character in String 1 is same in string 2 despite of the order
	public static void main(String[] args) {
		String m = "SShaktis";
		String n ="sihaktSS";
		Anagram a = new Anagram();
		System.out.println(a.isAnagram1(m,n));
		
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

private boolean isAnagram1(String s, String t) {

    Map<Character, Integer> map = new HashMap<Character, Integer>();
    int count = 0;
    for(char ch: s.toCharArray()){
        if(!map.containsKey(ch)){
        map.put(ch,1);}
    else{
        map.put(ch, map.get(ch)+1);
    }
    }
    
    for(char a: t.toCharArray()){
        if(map.containsKey(a)){
            int b = map.get(a);
            map.put(a, b-1);
            if((b-1)==0) {
            	map.remove(a);
            }
        }else{
            return false;
        }
    }
    
    
    return true;

}

	

}
