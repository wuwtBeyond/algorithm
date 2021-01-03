package com.github.algorithm.linkedlist;

import com.github.bean.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (l1 != null && l2 != null) {
            int val = l1.val + l2.val;
            ListNode node = new ListNode(val%10);
            p.next = node;
            p = node;

            l1 = l1.next;
            l2 = l2.next;
        }



        return head;
    }
}
