package com.array.easy;

import java.util.HashMap;
import java.util.Map;

////// Get the number which appears only once.
public class SingleNumber {

	public static void main(String[] args) {
		int[] num = {2,2,4,3,3,4,1,8,8};
		SingleNumber sn = new SingleNumber();
		int result = sn.getSingleNumber(num);
System.out.println(result);
	}

	private int getSingleNumber(int[] num) {
		
		Map<Integer,Integer> map =  new HashMap<>();
		//int i=0;
		//int result =0;
		for(int a: num) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		for(int b: num) {
			if(map.get(b)==1) {
				return b;
			}
		}
		return 0;
		
	}

}
