package linkedList;

import java.util.LinkedList;

public class MergeLinkedList {
	
	private static ListNode head;
	private static ListNode head1;

	public static void main(String[] args) {
		MergeLinkedList mergeLinkedList = new MergeLinkedList();
		head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(4);
		//head.next.next.next = new ListNode(7);
		
		
		head1 = new ListNode(1);
		head1.next = new ListNode(3);
		head1.next.next = new ListNode(4);
		//head1.next.next.next = new ListNode(8);

		ListNode result = mergeList(head,head1);
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

	private static ListNode  mergeList(ListNode l1, ListNode l2) {
		ListNode prehead = new ListNode(-1);
		ListNode prev = prehead;
		
		while(l1!=null && l2!=null) {
			if(l1.value < l2.value) {
				prev.next = l1;
				l1 = l1.next;
			}else{prev.next = l2;
			l2 = l2.next;
			}
			prev = prev.next;
		}
		
		if(l1==null) {
			prev.next = l2;
		}else {
			prev.next = l1;
		}
		
	
		return prehead.next;
	}
	
	private static class ListNode{
		int value;
		ListNode next;
		
		public ListNode(int value) {
			this.value = value;
		}
		
		
		
	}

}
