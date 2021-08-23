package arraysCode;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		String str = "aabcdeefge";
		char target = 'e';
		char[] ch = str.toCharArray();
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(char c : ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getKey()==target) {
				System.out.println("Occurance of "+target +" is "+ entry.getValue() );
			}
		}

	}

}
