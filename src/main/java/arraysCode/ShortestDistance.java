package arraysCode;

public class ShortestDistance {

	public static void main(String[] args) {
		String[] words = {"practice", "makes", "perfect", "coding", "makes"};
		String word1 ="coding";
		String word2 = "practice";
		int result = getShortestDistance(words, word1, word2);
		System.out.println(result);

	}

	private static int getShortestDistance(String[] words, String word1, String word2) {
		int x = -1, y = -1;
		int minLength = words.length;
		for(int i =0; i < words.length; i++) {
			if(words[i].equals(word1)) {
				x = i;
			}else if(words[i].equals(word2)) {
				y = i;
			}
			
			if(x!= -1 && y!= -1) {
				minLength = Math.min(minLength, Math.abs(x-y));
			}
		}
		return minLength;
	}

}
