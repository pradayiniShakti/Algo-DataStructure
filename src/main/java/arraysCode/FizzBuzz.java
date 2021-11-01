package arraysCode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		int n =15;
		List<String> result = getFizzBuzz(15);
		for(String a : result) {
			System.out.println(a);
		}
	}

	private static List<String> getFizzBuzz(int n) {
		//String[] s = new String[n];
		List<String> s = new ArrayList<String>();
		s.add("1");
		int m = 0;
		for(int i=2; i<=n ;i++) {
			//s[0]="1";
			//s.add("1");
			if(i%3==0 && i%5 !=0) {
				s.add("Fizz");
			}else if(i%5==0) {
				s.add("Buzz");
			}else if(i%3==0 && i%3 !=0) {
				s.add("FizzBuzz");
			} else {
				s.add(String.valueOf(i));
			}
			
		}
		return s;
	}

}
