package arraysCode;

public class ExcelColumnNumber {

	public static void main(String[] args) {
		String columnName ="AB";
		int columnNumber = getCorrespondingNumber(columnName);
		System.out.println(columnNumber);

	}

	private static int getCorrespondingNumber(String cn) {
		int result = 0;
		//int n = cn.length();
		for(char ch: cn.toCharArray()) {
			result = result * 26;
			result = result + ch - 'A' + 1;
		}
		
		
		return result;
	}

}
