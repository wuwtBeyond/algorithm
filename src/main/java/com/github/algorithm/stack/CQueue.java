package com.github.algorithm.stack;

import java.util.Stack;

public class CQueue {
    private Stack<Integer> stack_in;
    private Stack<Integer> stack_out;

    public CQueue() {
        stack_in = new Stack();
        stack_out = new Stack();
    }

    public void appendTail(int value) {
        stack_in.push(value);
    }

    public int deleteHead() {
        if(!stack_out.isEmpty()) {
            return stack_out.pop();
        }

        if(stack_in.isEmpty()) {
            return -1;
        }

        while(!stack_in.isEmpty()) {
            stack_out.push(stack_in.pop());
        }

        return stack_out.pop();
    }
}
