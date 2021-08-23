package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PallindromeList {
	
	private static ListNode head;
	private static ListNode head1;

	public static void main(String[] args) {
		//DuplicateLinkedList ll = new DuplicateLinkedList();
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);
		
		
		Boolean flag = isPallindrome(head);
		System.out.println(flag);
		//printTheLinkedList(finalList);
		/*System.out.println(result.value);
		System.out.println(result.next.value);
		System.out.println(result.next.next.value);
		System.out.println(result.next.next.next.value);*/
	}
	
	private static void printTheLinkedList(ListNode result) {
		while(result !=null) {
			System.out.print(result.value+"->");
			result = result.next;
		}
		System.out.print("null");
	}

	private static Boolean  isPallindrome(ListNode l1) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		ListNode curr = l1;
		
		while(curr!=null) {
			list.add(curr.value);
			curr= curr.next;
		}
		
		int i = 0;
		int j = list.size()-1;
		
		while(i<j) {
			if(!list.get(i).equals(list.get(j))) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
		
		
	}
	
	private static class ListNode{
		int value;
		ListNode next;
		
		public ListNode(int value) {
			this.value = value;
		}
		
		
		
	}

}
