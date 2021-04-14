package com.github.algorithm.linkedlist;

import com.github.bean.ListNode;

public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode a, ListNode b) {
        if (a == null || b == null) {
            return a == null ? b : a;
        }
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        ListNode ap = a, bp = b;
        while (ap != null && bp != null) {
            if (ap.val < bp.val) {
                tail.next = ap;
                tail = ap;
                ap = ap.next;
            } else {
                tail.next = bp;
                tail = bp;
                bp = bp.next;
            }
        }
        if (ap == null || bp == null) {
            if (ap == null) {
                tail.next = bp;
            } else {
                tail.next = ap;
            }
        }
        return head.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        return mergeKLists(lists, 0, lists.length-1);
    }

    public ListNode mergeKLists(ListNode[] lists, int left, int right) {
        if (left == right) {
            return lists[left];
        }
        if (left > right) {
            return null;
        }
        int mid = left + (right-left)/2;
        return mergeTwoLists(mergeKLists(lists, left, mid), mergeKLists(lists, mid+1, right));
    }
}
