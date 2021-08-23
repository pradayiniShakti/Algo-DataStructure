package arraysCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UniqueNumber {

	public static void main(String[] args) {
		int[] nums = {1,1,2,3,5,6,5};
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i< nums.length ; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i])+1);
			}else
			map.put(nums[i], 1);
			
		}
		
		for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" "+ entry.getValue());
			}else if(entry.getValue()==1) {
				System.out.println("The unique values are "+ entry.getKey());
			}
		}
	}

}
