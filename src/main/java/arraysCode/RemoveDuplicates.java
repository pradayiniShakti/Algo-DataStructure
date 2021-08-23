package arraysCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		
		int[] num = {-3,-1,0,0,0,3,3};
		int[] num1 = new int[num.length];
		
		int result = removeDuplicates.getDuplicatesRemoved(num);
		
		int[] fnalArray = Arrays.copyOfRange(num, 0, result);
		
		//System.out.println("Final array is "+Arrays.toString(fnalArray));
		
		
		////////////////////
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int n : num) {
			if (map.containsKey(n)){
				map.put(n, 1);
			}else {
				map.put(n, 1);
			}
		}
		int i=0;
	
		for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
			//i++;
			
			num[i++]= entry.getKey();
			
		}
		
		System.out.println("Removing duplicates   "+Arrays.toString(Arrays.copyOfRange(num, 0, i)));

	}

	private int getDuplicatesRemoved(int[] num) {
		int i= 0;

		for(int j=1; j< num.length; j++) {
			if(num[i]!=num[j]) {
				i++;
				num[i] = num[j];
			}
		}

		
		
		return i+1;
	}

}
