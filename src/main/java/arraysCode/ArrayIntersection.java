package arraysCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayIntersection {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		int[] result = getIntersection(nums1, nums2);
		System.out.println(Arrays.toString(result));
		

	}

	private static int[] getIntersection(int[] nums1, int[] nums2) {
		
		if(nums1.length ==0 || nums2.length ==0) {
			return new int[0];
		}
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> result = new HashSet<Integer>();
		
		
		for(int a: nums1) {
			set.add(a);
		}
		
		for(int i =0; i< nums2.length; i++) {
			if(set.contains(nums2[i])) {
				result.add(nums2[i]);
			}
		}
		
		int[] intersection = new int[result.size()];
		int j =0;
		for(int b: result) {
			intersection[j++]= b;
		}
		return intersection;
	}

}
