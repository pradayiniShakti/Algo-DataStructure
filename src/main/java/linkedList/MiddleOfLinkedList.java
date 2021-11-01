package linkedList;

import java.util.LinkedList;

public class MiddleOfLinkedList {
	
	private static ListNode head;
	private static ListNode head1;

	public static void main(String[] args) {
		//DuplicateLinkedList ll = new DuplicateLinkedList();
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);
		
		
		ListNode result = middleList(head);
		printTheLinkedList(result); 
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

	private static ListNode  middleList(ListNode l1) {
		
		ListNode slow = l1 , fast = l1;
		while(fast!=null && fast.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
		
		
	}
	
	private static class ListNode{
		int value;
		ListNode next;
		
		public ListNode(int value) {
			this.value = value;
		}
		
		
		
	}

}
