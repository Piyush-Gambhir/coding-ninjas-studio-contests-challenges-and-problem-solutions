
/************************************************************

    Following is the linked list node structure:
    
    class ListNode<T> {
 
		public T data;
		public ListNode<T> next;

		public ListNode(T data) {
			this.data = data;
		}
	}

************************************************************/

import java.util.*;
import java.io.*;

public class Solution {

	public static ListNode<Integer> reverseList(ListNode<Integer> head) {
		ListNode<Integer> previous = null, current = head, next;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static ListNode<Integer> addTwoLists(ListNode<Integer> first, ListNode<Integer> second) {
		first = reverseList(first);
		second = reverseList(second);

		int carry = 0;

		ListNode<Integer> dummy = new ListNode<Integer>(-1);
		ListNode<Integer> current = dummy;

		while (first != null && second != null) {
			ListNode<Integer> digit = new ListNode<Integer>((first.data + second.data + carry) % 10);
			carry = (first.data + second.data + carry) / 10;
			current.next = digit;
			current = current.next;
			first = first.next;
			second = second.next;
		}

		while (first != null) {
			ListNode<Integer> digit = new ListNode<Integer>((first.data + carry) % 10);
			carry = (first.data + carry) / 10;
			current.next = digit;
			current = current.next;
			first = first.next;
		}

		while (second != null) {
			ListNode<Integer> digit = new ListNode<Integer>((second.data + carry) % 10);
			carry = (second.data + carry) / 10;
			current.next = digit;
			current = current.next;
			second = second.next;
		}

		if (carry > 0) {
			ListNode<Integer> digit = new ListNode<Integer>(carry);
			current.next = digit;
		}

		dummy = reverseList(dummy.next);

		return dummy;
	}

}