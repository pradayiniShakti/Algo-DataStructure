package com.String.easy;


/*Input: s = "abbaca"
Output: "ca"
Explanation: 
For example, in "abbaca" we could remove "bb" since the letters are adjacent a
nd equal, and this is the only possible move.  The result of this move is that 
the string is "aaca", of which only "aa" is possible, so the final string is "ca".*/
public class DeleteAdjacentDuplicates {

	public static void main(String[] args) {
		String s = "abbaca";
		String result = removeDuplicates(s);
		System.out.println(result);
	}

	private static String removeDuplicates(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		int i =0;
		for(char ch: s.toCharArray()) {
			if(i!=0 && ch==sb.charAt(i-1) ){
				sb.deleteCharAt(i- 1);
				i--;
			}else {
				sb.append(ch);
				i++;
			}
		}
		return sb.toString();
	}

}
