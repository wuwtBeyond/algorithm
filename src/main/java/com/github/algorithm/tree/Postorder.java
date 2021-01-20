package com.github.algorithm.tree;


import java.util.LinkedList;
import java.util.List;

public class Postorder {

    List<Integer> path;

    public List<Integer> postorder(Node root) {
        path = new LinkedList<>();
        if (root == null) {
            return path;
        }

        postOrderTraversal(root);
        path.add(root.val);

        return path;
    }

    private void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }

        for (Node node : root.children) {
            postOrderTraversal(node);
            path.add(node.val);
        }
    }

    private class Node {
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
    };
}
