package arraysCode;

import java.util.HashMap;
import java.util.Map;

public class MinimumMove {

	public static void main(String[] args) {
		int[] num = {1,3,4,5};
		int result = getMinMoveCount(num);
		System.out.println(result);
	}

	private static int getMinMoveCount(int[] num) {
		int moves = 0;
		int min = Integer.MAX_VALUE;
		for(int i =0; i < num.length; i++) {
			min = Math.min(min, num[i]);
		}
		for(int i =0; i< num.length ; i++) {
			moves = moves + num[i] - min;
		}
		return moves;
	}

}
