package com.String.easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		LongestCommonPrefix cp = new LongestCommonPrefix();
		
	String[] strs = {"flower","flow","flight"};
	
	String prefix = cp.getLongestPreffix(strs);
	System.out.println(prefix);

	}

	private String getLongestPreffix(String[] strs) {
		if(strs.length == 0 ) return "";
		
		String pref = strs[0];
		for(int i=1; i<strs.length; i++) {
			while(strs[i].indexOf(pref)!=0) {
				pref = pref.substring(0, pref.length()-1);
				if(pref.isEmpty()) return "";
			}
		}
		
		return pref;
	}

}
