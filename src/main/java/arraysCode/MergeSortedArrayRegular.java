package arraysCode;

import java.util.Arrays;

public class MergeSortedArrayRegular {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,6};
		int[] arr2 = {2,3,7,8};
		int n1 = arr1.length;
		int n2 = arr2.length;
		int[] arr3 = new int[n1+n2];		
		MergeSortedArrayRegular mergeSortedArray = new MergeSortedArrayRegular();
		int[] mergedArray = mergeSortedArray.getMerge(arr1, arr2, n1,n2, arr3);
		
		System.out.println(Arrays.toString(mergedArray));

	}

	private int[] getMerge(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
		int i=0; 
		int j=0; 
		int k=0;
		
		while(i<n1 && j< n2) {
			if(arr1[i]<arr2[j] ) 
				arr3[k++] = arr1[i++];
			else 
				arr3[k++] = arr2[j++];
			
		}
		
		while(i<n1) {
			arr3[k++] = arr1[i++];
		}
		while(j<n2) {
			arr3[k++] = arr2[j++];
		}
		
		return arr3;
	}

}
