package arraysCode;

public class SearchInsert {

	public static void main(String[] args) {
		SearchInsert searchInsert = new SearchInsert();
		int[] num = {1,3,5,8};
		int target = 7;
		int result =  searchInsert.getIndex(num, target);
		System.out.println("Required index is "+result);

	}

	private int getIndex(int[] num, int target) {
		int l = 0;
		int h = num.length -1;
		
		while(l<=h) {
			int m = (l+h)/2;
			if(num[m]< target) {
				l= m+1;
			}else if(num[m]> target) {
				h = m-1;
			}else {
				return m;
			}
		}
		if(l>h) 
		return l;
		else
		return h;
	}

}
