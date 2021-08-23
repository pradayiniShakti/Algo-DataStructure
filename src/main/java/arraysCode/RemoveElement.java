package arraysCode;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		RemoveElement removeElement = new RemoveElement();
		int num[] = {1,1,2,3,4,5,3};
		int val = 3;
		int result =  removeElement.getRemovedElement(num, val);
		
		int[] finalArray = Arrays.copyOfRange(num, 0, result);
		
		System.out.println(Arrays.toString(finalArray));
	}

	private int getRemovedElement(int[] num, int val) {
		int i=0;
		for(int j=0; j<num.length ;j++) {
			if(num[j]!= val) {
				num[i] =  num[j];
				i++;
			}
		}
		return i;
	}

}
