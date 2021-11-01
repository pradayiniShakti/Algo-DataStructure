package arraysCode;

import java.util.HashMap;
import java.util.Map;

public class MaxEntry {

	public static void main(String[] args) {
		MaxEntry max = new MaxEntry();
		int[] nums= {3,2,3};
		
		int result = max.majorityElement(nums);
		System.out.println(result);
	}

	private int majorityElement(int[] nums) {

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int n1 = nums.length;
       // int count =0;
        int result = 0;
        for(int i =0; i< nums.length; i++){
            if(map.containsKey(nums[i])){
            	int a = map.get(nums[i])+1;
                map.put(nums[i], a);
            }else{
                map.put(nums[i], 1);
            }
        }
        
       // Map.Entry<Integer, Integer> maxEntry = null;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
        	if(entry.getValue()> n1/2) {
        		 result = entry.getKey();
        	}
        }
    return result;
	}

}
