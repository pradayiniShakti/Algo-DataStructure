package arraysCode;

import java.util.Arrays;

public class MoveZeroes {

	public static void main(String[] args) {
		MoveZeroes mv = new MoveZeroes();
		int[] nums = {1,0,0,2,0,3,0,4};
	System.out.println(Arrays.toString(mv.getFinalArray(nums)));

	}

	private int[] getFinalArray(int[] nums) {
		
		if (nums == null || nums.length == 0) {
			return null;        
		}

	    int m = 0;
	  //  for (int num: nums) {
	       // if (num != 0) nums[m++] = num;
	    //}  
	    
	    for(int n =0; n<nums.length; n++ ) {
	    	if(nums[n]!=0) {
	    		nums[m++]= nums[n];
	    	}
	    }

	    while (m < nums.length) {
	        nums[m++] = 0;
	    }
		return nums;
		// TODO Auto-generated method stub
		
	}

}
