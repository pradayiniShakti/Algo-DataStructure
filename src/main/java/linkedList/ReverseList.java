package linkedList;

import java.util.LinkedList;

public class ReverseList {
	
	private static ListNode head;
	private static ListNode head1;

	public static void main(String[] args) {
		//DuplicateLinkedList ll = new DuplicateLinkedList();
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		
		ListNode finalList = reverseList(head);
		printTheLinkedList(finalList); 
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

	private static ListNode  reverseList(ListNode l1) {
		
		ListNode curr = l1;
		ListNode prev = null;
		ListNode next =  null;
		
		while(curr!=null) {
			 next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
		
		
	}
	
	private static class ListNode{
		int value;
		ListNode next;
		
		public ListNode(int value) {
			this.value = value;
		}
		
		
		
	}

}
