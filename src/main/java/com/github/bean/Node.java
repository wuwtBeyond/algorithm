package com.github.bean;

/**
 * @author : wuwentao
 * @date : 2020/5/24
 */
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
    public Node random;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
