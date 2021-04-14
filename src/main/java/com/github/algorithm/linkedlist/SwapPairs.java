package com.github.algorithm.linkedlist;

import com.github.bean.ListNode;

public class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode it = fakeHead;
        while (it.next != null && it.next.next != null) {
            ListNode node1 = it.next;
            ListNode node2 = it.next.next;
            node1.next = node2.next;
            node2.next = node1;
            it.next = node2;
            it = node1;
        }

        return fakeHead.next;











//        ListNode dummyHead = new ListNode(0);
//        dummyHead.next = head;
//        ListNode temp = dummyHead;
//        while (temp.next != null && temp.next.next != null) {
//            ListNode node1 = temp.next;
//            ListNode node2 = temp.next.next;
//            temp.next = node2;
//            node1.next = node2.next;
//            node2.next = node1;
//            temp = node1;
//        }
//        return dummyHead.next;
    }
}
