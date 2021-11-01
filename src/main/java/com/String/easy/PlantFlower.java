package com.String.easy;

public class PlantFlower {

	public static void main(String[] args) {
		int[] flowerBed = {1,0,0,0,1};
		int n = 1;
		
		boolean flag = plantFlower(flowerBed, n);
		System.out.println(flag);
	}

	private static boolean plantFlower(int[] flowerBed, int n) {
		int  count = 0;
		for(int i =0; i< flowerBed.length;i++) {
			if(flowerBed[i]==0 && (i==0 || flowerBed[i-1]==0) && (i==flowerBed.length-1 ||flowerBed[i+1]==0)) {
				flowerBed[i++] = 1;
				count++;
			}
			if(count>=n) {
				return true;
			}
			//i++;
		}
		return false;
	}

}
