package com.github.algorithm.str;

import com.github.bean.ListNode;

import java.util.Stack;

/**
 * @author : wuwentao
 * @date : 2020/4/28
 */
public class Convert_Binary_Number_in_a_Linked_List_to_Integer {


    /**
     * 位运算，节省两次遍历
     * @param head
     * @return
     */
    public int getDecimalValue(ListNode head) {
        if (head == null) return 0;

        int res = 0;
        while (head != null) {
            res <<= 2;
            res += head.val;
            head = head.next;
        }

        return res;
    }

    // 10011
//    public int getDecimalValue(ListNode head) {
//        if (head == null) return 0;
//
//        Stack<Integer> stack = new Stack<>();
//
//        ListNode p = head;
//        while (p != null) {
//            stack.push(p.val);
//            p = p.next;
//        }
//
//        int res = 0, count = 0;
//        while (!stack.empty()) {
//            res += (stack.pop() * Math.pow(2, count));
//            count ++;
//        }
//
//        return res;
//    }
}
