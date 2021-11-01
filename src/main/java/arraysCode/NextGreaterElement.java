package arraysCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int[] result = getNextGreater(nums1, nums2);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getNextGreater(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.empty() && nums2[i] > stack.peek()) {
                map.put(stack.pop(), nums2[i]);}
            stack.push(nums2[i]);
        }
    
        while (!stack.empty())
            map.put(stack.pop(), -1);
    
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }
                                            
        return res;}

}
