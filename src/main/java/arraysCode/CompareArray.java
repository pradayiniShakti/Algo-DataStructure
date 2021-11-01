package arraysCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArray {
//// get the common in the two array
	public static void main(String[] args) {
		int[] num1 = {1,2,3,4,4,6,6,6};
		int n1 =  num1.length;
		
		int[] num2 = {3,2,0,4,4,4,5};
		int n2 =  num2.length;
	
		int[] result = getCommonArray(num1, num2,n1,n2);
		System.out.println(Arrays.toString(result));
		

	}

	private static int[] getCommonArray(int[] num1, int[] num2, int n1,int n2) {
		int i=0;
		
		ArrayList<Integer> list = new ArrayList();
		int z = Math.max(n1, n2);
				
		while(i<z) {
			if(num1[i] ==num2[i] ) {
				list.add(num1[i]);
				//num3[k++]= num1[i];	
			}
			i++;
			
		}
		
		
		return ListToArray(list);
	}
	
	private static int[] ListToArray(List<Integer> list) {
		int[] result = new int[list.size()];
		int ctr = 0;
		for(int val : list) {
			result[ctr++]=val;
		}
		return result;
	}

}
