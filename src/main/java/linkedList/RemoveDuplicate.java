package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicate {
	
	private static ListNode head;
	//private static ListNode head1;

	public static void main(String[] args) {
		//DuplicateLinkedList ll = new DuplicateLinkedList();
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		
		
		ListNode result = removeElementFromList(head);
		//System.out.println(flag);
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

	private static ListNode  removeElementFromList(ListNode l1) {
		
		ListNode curr = l1;
		
		while(curr!=null && curr.next!=null) {
			if(curr.value == curr.next.value) {
				curr.next = curr.next.next;
			}else {
				curr = curr.next;
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
