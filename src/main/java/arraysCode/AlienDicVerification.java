package arraysCode;

public class AlienDicVerification {

	public static void main(String[] args) {
		String[] words = {"hello","leetcode"};
		String order = "hlabcdefgijkmnopqrstuvwxyz";
		boolean result = verifyAlienDics(words, order);
		System.out.println(result);
		

	}

	private static boolean verifyAlienDics(String[] words, String order) {
		int[] wordBank = new int[26];
		for(int i =0; i< order.length(); i++) {
			wordBank[order.charAt(i) - 'a'] = i;
		}
		for(int i =0; i< words.length -1 ;i++) {
			for(int j=0; j< words[i].length(); j++) {
				if(j>= words[i+1].length()) return false;
				if(words[i].charAt(j) != words[i+1].charAt(j)) {
					int current = words[i].charAt(j) - 'a';
					int next = words[i+1].charAt(j) - 'a';
					if(wordBank[current]> wordBank[next]) {
						return false;
					}else {
						break;
					}
				}
			}
		}
		return true;
	}

}
