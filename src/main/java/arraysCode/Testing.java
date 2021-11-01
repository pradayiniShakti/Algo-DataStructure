package arraysCode;

import java.util.HashMap;
import java.util.Map;

public class Testing {
	
	static int temp = 0;
	static char ch1;
	
	public static String betterCompression(String s) {
	    // Write your code here
	    StringBuilder sb = new StringBuilder();
	     Map<Character, StringBuilder> map = new HashMap<Character, StringBuilder>();
	     //Character.getNumericValue(s.charAt(j)))
	     //Character.isDigit(s.charAt(m)
	     int i=0;
	     for(char ch: s.toCharArray()) {
	    	 int sum =0;
	    	
	    	 if(Character.isDigit(s.charAt(i++)) ){
	    		 sum = sum*10 + ch + '0';
	    	 }else {
	    	
	    	 }
	     }
	  
	    return sb.toString();

	    }

	public static void main(String[] args) {
		Testing obj = new Testing();
		String result = obj.betterCompression("a45c9b2c1a5");
		System.out.println(result);

	}

}
