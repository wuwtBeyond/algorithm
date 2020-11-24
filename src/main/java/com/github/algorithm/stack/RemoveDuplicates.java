package com.github.algorithm.stack;

import java.util.Stack;

public class RemoveDuplicates {
    public String removeDuplicates(String S) {
        if(S == null || S.length() <= 1) {
            return S;
        }

        Stack<Character> stack = new Stack<>();
        stack.push(S.charAt(0));
        for(int i = 1;i < S.length();i ++) {
            if(!stack.isEmpty() && stack.peek() == S.charAt(i)) {
                stack.pop();
            } else {
                stack.push(S.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
