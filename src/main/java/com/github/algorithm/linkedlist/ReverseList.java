package com.github.algorithm.linkedlist;

import com.github.bean.ListNode;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;

        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;

            pre = cur;
            cur = next;

        }

        return pre;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = reverseList2(head.next);
        head.next.next = head;
        head.next = null;

        return p;
    }

    public static void main(String[] args) {
        ReverseList reverseList = new ReverseList();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode p = reverseList.reverseList2(node1);
        System.out.println(p);
    }
}
