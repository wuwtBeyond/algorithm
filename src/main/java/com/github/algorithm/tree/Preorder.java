package com.github.algorithm.tree;

import java.util.LinkedList;
import java.util.List;

public class Preorder {

    public List<Integer> preorder(Node root) {
        List<Integer> path = new LinkedList<>();
        preorderTraversal(root, path);
        return path;
    }

    private void preorderTraversal(Node root, List<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.val);
        for (Node node : root.children) {
            preorderTraversal(node, path);
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}

