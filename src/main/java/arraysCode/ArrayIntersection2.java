package arraysCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*prints the  common value

int[] nums1 = {1,2,2,1};
int[] nums2 = {2,2};

result : [2,2]*/
public class ArrayIntersection2 {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2,2};
		
		int[] result = getIntersection(nums1, nums2);
		System.out.println(Arrays.toString(result));
		

	}

	private static int[] getIntersection(int[] nums1, int[] nums2) {
		
		if(nums1.length > nums2.length) {
			return getIntersection(nums2,  nums1);
		}
		int count =0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int a : nums1) {
			if(!map.containsKey(a)) {
				map.put(a, 1);
			}else {
				map.put(a, map.get(a)+1);
			}
		}
		
		int k =0;
		for(int b : nums2) {
				int c = map.getOrDefault(b,0);
			if(c>0) {
				nums1[k++] = b;
				map.put(b, c-1);
			}
			
		}
		
		
		return Arrays.copyOfRange(nums1, 0, k);
	}

}
