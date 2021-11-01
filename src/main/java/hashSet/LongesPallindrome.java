package hashSet;

import java.util.HashSet;
import java.util.Set;

public class LongesPallindrome {

	public static void main(String[] args) {
		String str = "abccccdd";
		int n = getLongestPallindrom(str);
		System.out.println(n);

	}

	private static int getLongestPallindrom(String str) {
		Set<Character> set = new HashSet<Character>();
		int count =0;
		char[] ch = str.toCharArray();
		for(char c: ch) {
			if(set.contains(c)) {
				set.remove(c);
				count++;
			}else {
				set.add(c);
			}
		}
		if(set.isEmpty()) {
			return count*2;
		}else return count*2 +1;
		
	
	}

}
