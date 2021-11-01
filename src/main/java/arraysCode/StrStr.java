package arraysCode;

public class StrStr {

	public static void main(String[] args) {
		String s ="hello";
		String t = "ll";
		int result = getTheIndex(s,t);
		System.out.println(result);

	}

	private static int getTheIndex(String s, String t) {
		
		if(t.length()==0) return 0;
		char end = t.charAt(t.length()-1);
		int i =0;
		for(int j = t.length()-1; j< s.length();j++) {
			if(s.charAt(j)==end) {
				i = j - (t.length()-1);
				if(s.substring(i, j+1).equals(t)) {
					return i;
				}
				
			}
		}
		return -1;
	}

}
