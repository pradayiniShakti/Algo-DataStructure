package com.array.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
		int[] num = {2,2,1,1,1,1,2,2,3,3,3,3,3,3,3};
		
		MajorityElement me = new MajorityElement();
		
		Map<Integer, Integer> map = me.getMaxElemCount(num);
		
		int result = me.getMaxElemCount(map);
		
System.out.println(result);
	}

	private int getMaxElemCount(Map<Integer, Integer> map) {
		Map.Entry<Integer,Integer> maxEntry = null;
		for(Map.Entry<Integer,Integer> a: map.entrySet()) {
			if(maxEntry==null||a.getValue()> maxEntry.getValue()) {
				maxEntry = a;
			}
		}
		return maxEntry.getKey();
	}

	private Map<Integer, Integer> getMaxElemCount(int[] num) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int a : num) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			}else {
				map.put(a, 1);
			}
		}
		return map;
	}



}
