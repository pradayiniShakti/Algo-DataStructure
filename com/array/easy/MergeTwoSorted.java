package com.array.easy;

public class MergeTwoSorted {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,4};
		int n1 = arr1.length;
		int[] arr2 = {1,5,6,6,7};
		int n2 = arr2.length;
		int[] arr3 = new int[n1+n2];
		
		mergeArray(arr1,arr2, arr3, n1,n2);
        System.out.println("Array after merging"); 
        for (int i=0; i < n1+n2; i++) 
            System.out.print(arr3[i] + ", "); 

	}

	private static void mergeArray(int[] arr1, int[] arr2, int[] arr3, int n1, int n2) {
		
		int i=0; 
		int j=0; 
		int k = 0;
		
		while(i<n1 && j<n2) {
			if(arr1[i]<arr2[j]) {
				arr3[k++] = arr1[i++];
			}else {
				arr3[k++] = arr2[j++];
			}
		}
		
		while(i<n1) {
			arr3[k++] = arr1[i++];
		}
		
		while(j<n2) {
			arr3[k++] = arr2[j++];
		}
		
	}

}
