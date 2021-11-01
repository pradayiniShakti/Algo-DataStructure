package arraysCode;

import java.util.Stack;

public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {
		String s = "deeedbbcccbdaa";
		RemoveAdjacentDuplicates rm = new RemoveAdjacentDuplicates();
				int k = 3;
				String result = rm.getDuplicatesRemoved(s,k);
				System.out.println(result);

	}

	private String getDuplicatesRemoved(String s, int k) {
		StringBuilder sb = new StringBuilder(s);
	    Stack<Integer> counts = new Stack<Integer>();
	    for (int i = 0; i < sb.length(); ++i) {
	        if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
	            counts.push(1);
	        } else {
	            int incremented = counts.pop() + 1;
	            if (incremented == k) {
	                sb.delete(i - k + 1, i + 1);
	                i = i - k;
	            } else {
	                counts.push(incremented);
	            }
	        }
	    }
	    return sb.toString();
	}

}
