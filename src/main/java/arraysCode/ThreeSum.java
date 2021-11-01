package arraysCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]*/
public class ThreeSum {
	
	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length && nums[i]<=0; ++i) {
			if(i==0 || nums[i]!=nums[i-1]) {
				result = getThreeSum(nums,i, result);
			}
		}
		for(List<Integer> a : result) {
			System.out.println(a.toString());
		}
		

	}

	private static List<List<Integer>> getThreeSum(int[] nums, int i, List<List<Integer>> res) {
        int lo = i+1;
        int hi = nums.length -1;
        while(lo<hi){
            int sum = nums[i] + nums[lo] +nums[hi];
            if(sum<0){
                ++lo;
            }else if(sum>0){
                --hi;
            }else{
                res.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                while(lo<hi && nums[lo] == nums[lo-1]){
                    ++lo;
					/*
					 * Arrays.sort( end, new Comparator<Integer>() { public int compare(Integer a,
					 * Integer b) { return a - b; } });
					 */               }
            }
        }
		return res;}
	
	
		
	

}
