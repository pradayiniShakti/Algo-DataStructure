package com.array.easy;

import java.util.Arrays;

public class MovingZeros {

	public static void main(String[] args) {
		int[] num = {8,4,0,5,0};
		MovingZeros mz = new MovingZeros();
		mz.getMovedZero(num);
		
		System.out.println(Arrays.toString(num));

	}

	private void getMovedZero(int[] num) {
		int j=0;
		for(int i = 0; i< num.length; i++) {
			if(num[i]!=0) {
			
				num[j] = num[i];
				j++;
				if(i>=j) {
					num[i]=0;
				}
			}
		}
		
		
	}

}
