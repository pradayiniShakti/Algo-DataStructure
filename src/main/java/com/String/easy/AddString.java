package com.String.easy;

public class AddString {

	public static void main(String[] args) {
		String s1 = "456";
		String s2 = "77";
		String result = getSum(s1, s2);
		System.out.println(result);

	}

	private static String getSum(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		int p1= s1.length()-1;
		int p2 = s2.length()-1;
		int carry =0;
		while(p1>=0  || p2>=0) {
			int x1 = p1>=0 ? s1.charAt(p1)- '0' : 0;
			int x2 = p2>=0 ? s2.charAt(p2)- '0' : 0;
			int val = (x1 +x2 + carry)%10;
			
			carry = (x1 +x2 + carry)/10;
			sb.append(val);
			p1--;
			p2--;
		}
		if(carry!=0) {
			sb.append(carry);
		}
		return sb.reverse().toString();
	}

}
