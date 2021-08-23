package com.String.easy;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) throws Exception {
		int[] nums = {1,2,3,4,5,6};
		int y = 2;
		foo(nums, 2);
	}

	
	public static void foo(int[] nums, int y) throws Exception {
	    if (y <= 0) {
	        throw new Exception("invalid argument: " + y);
	    }
	    int i = 0;
	    while (i < nums.length) {
	        int[] arr = Arrays.copyOfRange(nums, i, i+y);//(nums, 0,2 )//{1,2},//(nums, 2,4)//{3,4}
	        System.out.println(Arrays.toString(arr));//[1,2],[3,4]
	        i = i + y;// i=2
	    }
	}


}
