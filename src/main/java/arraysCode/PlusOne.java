package arraysCode;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] num = {1,9};
		int[] result = getPlusOne(num);
		System.out.println(Arrays.toString(result));
	}

	private static int[] getPlusOne(int[] num) {
		int n = num.length;
		for(int i= n-1; i>=0; --i) {
			if(num[i]==9) {
				num[i] = 0;
			}else {
				num[i] = num[i]+1;
				return num;
			}
		}
		
		num = new int[n+1];
		num[0]= 1;
		return num;
	}

}
