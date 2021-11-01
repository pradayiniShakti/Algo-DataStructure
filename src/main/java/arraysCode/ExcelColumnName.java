package arraysCode;

public class ExcelColumnName {

	public static void main(String[] args) {
		int columnNumber = 28;
		String result = getCorrespondingName(columnNumber);
		System.out.println(result);
				

	}

	private static String getCorrespondingName(int cn) {
		StringBuilder sb = new StringBuilder();
		while(cn>0) {
			cn--;
			sb.insert(0,
					(char)(cn%26 + 'a'));
			cn = cn/26;
		}
		return sb.toString();
	}

}
