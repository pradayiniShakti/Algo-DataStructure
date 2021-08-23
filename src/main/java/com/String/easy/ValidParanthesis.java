package com.String.easy;

import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		ValidParanthesis validParanthesis = new ValidParanthesis();
		
		String str = "([)]";
		
		System.out.println(validParanthesis.getIfValid(str));

	}

	/*
	 * private boolean getIfValid(String str) { int length =0;
	 * while(str.length()!=length) { length = str.length(); str =
	 * str.replace("()","").replace("[]", "").replace("{}", ""); } return
	 * (str.length() == 0);
	 * 
	 * 
	 * }
	 */
	
	private boolean getIfValid(String str) {
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i< str.length(); i++) {
			char a = str.charAt(i);
			if(a == '('|| a == '{' || a == '[') {
				stack.push(a);
			}else if(stack.empty()) {
				return false;
			}else if(a==')' && stack.pop()!='(') return false;
			else if(a=='}' && stack.pop()!='{') return false;
			else if(a==']' && stack.pop()!='[') return false;
		}
		return stack.empty();
		
		
	}

}
