package arraysCode;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		int num1[][] = {{1,2,3},{5,3,2},{0,9,4}};
		int min = num1[0][0];
		int max = num1[0][0];
		for(int i =0; i < num1.length; i++) {
			for(int j =0; j< num1[0].length; j++) {
				if(num1[i][j]< min) {
					min = num1[i][j];
				}else if(num1[i][j]>max){
					max = num1[i][j];
				}
			}
		}
System.out.println(min);
System.out.println(max);
	}

}
