package com.github.algorithm.linkedlist;

import com.github.bean.Node;

/**
 * @author : wuwentao
 * @date : 2020/5/24
 */
public class CopyListwithRandomPointer {


    /**
     * 在每个节点后面直接copy新的节点出来跟在后面
     * 改变random指针的顺序
     * 提取新的链表
     * @param head
     * @return
     */
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        Node p = head;
        while (p != null) {
            Node after = new Node(p.val);
            Node next = p.next;
            p.next = after;
            after.next = next;

            p = next;
        }

        p = head;
        while (p != null) {
            Node after = p.next;
            if (p.random != null) {
                after.random = p.random.next;
            }
            p = after.next;
        }

        p = head;
        Node first = head.next;
        while (p != null) {
            Node after = p.next;
            Node next = after.next;
            p.next = next;
            if (next != null) {
                after.next = next.next;
                p = next;
            }else {
                after.next = null;
                p = null;
            }
        }


        return first;
    }
}
