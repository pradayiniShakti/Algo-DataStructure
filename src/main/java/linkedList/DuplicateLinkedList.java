package linkedList;

import java.util.LinkedList;

public class DuplicateLinkedList {
	
	private static ListNode head;
	private static ListNode head1;

	public static void main(String[] args) {
		//DuplicateLinkedList ll = new DuplicateLinkedList();
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(4);
		
		
		ListNode finalList = removeDuplicate(head);
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

	private static ListNode  removeDuplicate(ListNode l1) {
		
		ListNode l2 = l1;
		
		while(l2.next!=null && l2!=null) {
			
			if(l2.next.value==l2.value) {
				l2.next = l2.next.next;
			}else {
				l2 =l2.next;
			}
		}
		return l1;
		
		
	}
	
	private static class ListNode{
		int value;
		ListNode next;
		
		public ListNode(int value) {
			this.value = value;
		}
		
		
		
	}

}
