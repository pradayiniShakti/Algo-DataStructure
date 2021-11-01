package arraysCode;

import java.util.Arrays;

public class MergeSortedArray2 {

	public static void main(String[] args) {
		int[] num1 = {1,2,3,0,0,0};
		int m = 3;
		int[] num2 = {4,5,6};
		int n =3;
		
		System.out.println(Arrays.toString(getMergedArray(num1, m, num2, n)));
		//"shakti".getClass().getSimpleName() =="String";

	}

	private static int[] getMergedArray(int[] num1, int m, int[] num2, int n) {
		int p1 = m-1;
		int p2 = n-1;
		for(int p = m+n-1; p>=0; p--) {
			if(p2<0) break;
			if(p>0 && num1[p1]>num2[p2]) {
				num1[p] = num1[p1--];
			}else {
				num1[p] = num2[p2--];
			}
		}
		return num1;
	}

}
