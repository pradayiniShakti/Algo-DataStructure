package arraysCode;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {
		String j = "aA";
		String s = "aAAbbbb";
		int res = getJewels(j,s);
		System.out.println(res);

	}

	private static int getJewels(String j, String s) {
		Set<Character> set = new HashSet<Character>();
		int count=0;
		for(char c: j.toCharArray()) {
			set.add(c);
		}
		
		for(char m: s.toCharArray()) {
			if(set.contains(m)) {
				count++;
			}
		}
		return count;
	}

}
