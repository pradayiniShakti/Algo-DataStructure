package linkedList;

import java.util.LinkedList;

public class LinkedListIntersection {
	
	private static ListNode head;
	private static ListNode head1;

	public static void main(String[] args) {
		//LinkedListIntersection mergeLinkedList = new LinkedListIntersection();
		head = new ListNode(4);
		head.next = new ListNode(1);
		head.next.next = new ListNode(8);
		head.next.next.next = new ListNode(4);
		//head.next.next.next.next = new ListNode(5);
		
		
		head1 = new ListNode(2);
		head1.next = new ListNode(1);
		head1.next.next = new ListNode(8);
		head1.next.next.next = new ListNode(4);
		///head1.next.next.next.next = new ListNode(4);
		//head1.next.next.next.next.next = new ListNode(5);


		ListNode result = intersection(head,head1);
		//printTheLinkedList(head);
		
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
		//System.out.print("null");
	}

	private static ListNode  intersection(ListNode headA, ListNode headB) {
		
		 ListNode pA = headA;
	        ListNode pB = headB;
	        while (pA != pB) {
	            pA = pA == null ? headB : pA.next;
	            pB = pB == null ? headA : pB.next;
	        }
	        return pA;
    }
	
	public static class ListNode{
		int value;
		ListNode next;
		
		public ListNode(int value) {
			this.value = value;
		}
		
		
		
	}

}
