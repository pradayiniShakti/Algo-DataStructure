package arraysCode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] num = {2,7,15,11};
		
		int target = 9;
		
		int[] reqIndex = getIndecies(num, target);
		
		System.out.println(Arrays.toString(reqIndex));
		
	}

	private static int[] getIndecies(int[] num, int target) {
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
	
		
		for(int i=0;i < num.length; i++) {
			int component = target - num[i];
			if (map.containsKey(component)) {
				return new int[] {map.get(component),i};
			}
			map.put(num[i], i);
		}
		return null;
	}

}
