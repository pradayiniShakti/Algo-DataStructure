package hashSet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LoggerLimiter {
	
	//private static Map<Integer,String > map;
	private Map<String, Integer> map1 = new HashMap<String, Integer>();
	private static int t;

	public LoggerLimiter() {
		//map = new HashMap<Integer, String>();
		
	}
	
	public static void main(String[] args) {
		LinkedHashMap< Integer,String> map = new LinkedHashMap<Integer, String>();
		map.put(null, "");
		map.put(1, "foo");
		map.put(2, "bar");
		map.put(3, "foo");
		map.put(8, "bar");
		map.put(10, "foo");
		map.put(11, "foo");
		map.put(20, "foo");
		map.put(21, "bar");
	
		LoggerLimiter log = new LoggerLimiter();
		boolean[] dp = new boolean[map.size()];
		int i =0;
		
		for(Entry<Integer, String> entry: map.entrySet()) {
			dp[i++] = log.shouldPrintMessage(entry.getKey(), entry.getValue());		
		}
		
		System.out.println(Arrays.toString(dp));
		
	}
	
	private boolean shouldPrintMessage(Integer time, String message) {
		
		
		if(!map1.containsKey(message)) {
			map1.put(message, time);
			return true;
		} 
			t = map1.get(message);
			int nextTime = t+ 10;
			if(time >= nextTime) {
				map1.put(message, time);
				return true;
			}else return false;
			
		
		
	}



}
