package arraysCode;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairs {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,1,3};
		
		int result = getGoodPairCount(nums);
System.out.println(result);
	}

	private static int getGoodPairCount(int[] nums) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int count =0;
		for(int n : nums) {
			if(!map.containsKey(n)) {
				map.put(n, 1);
			}else {
				int temp = map.get(n);
				count = count + temp;
				map.put(n, temp+1);
			}
		}
		return count;
	}

}
