package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class Tree2str {
    private StringBuilder sb;
    public String tree2str(TreeNode t) {
        sb = new StringBuilder();
        preOrderTraversal(t);

        return sb.toString();
    }

    private StringBuilder preOrderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }

        sb.append(root.val);
        if (root.left != null && root.right != null) {
            sb.append("(");
            preOrderTraversal(root.left);
            sb.append(")(");
            preOrderTraversal(root.right);
            sb.append(")");
        } else if (root.left != null) {
            sb.append("(");
            preOrderTraversal(root.left);
            sb.append(")");
        } else if (root.right != null) {
            sb.append("()"+"(");
            preOrderTraversal(root.right);
            sb.append(")");
        }

        return sb;
    }
}
