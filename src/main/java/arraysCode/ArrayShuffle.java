package arraysCode;

import java.util.Arrays;

/*Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

Return the array in the form [x1,y1,x2,y2,...,xn,yn].*/
public class ArrayShuffle {

	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int n =3;
		int[] result = getShuffledArray(nums, n);
		System.out.println(Arrays.toString(result));

	}

	private static int[] getShuffledArray(int[] nums, int n) {
		int[] res = new int[nums.length];
		int k = 0;
		for(int i =0, j=n; i<n; i++,j++,k = k+2) {
			res[k]= nums[i];
			res[k+1] = nums[j];
			
		}
		return res;
	}

}
