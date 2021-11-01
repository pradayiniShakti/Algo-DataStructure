package com.String.easy;

public class RoateString {
	/*
	 * Given two strings s and goal, return true if and only if s can become goal
	 * after some number of shifts on s.
	 * 
	 * A shift on s consists of moving the leftmost character of s to the rightmost
	 * position.
	 * 
	 * For example, if s = "abcde", then it will be "bcdea" after one shift.
	 */
	public static void main(String[] args) {
		String s = "abcde", t = "bcdea";
		boolean result = isRotableToGoal(s, t);
		System.out.println(result);
	}

	private static boolean isRotableToGoal(String s, String t) {
		if(s.length() == t.length() && (s+s).contains(t)) {
			return true;
		}
		return false;
	}

}
