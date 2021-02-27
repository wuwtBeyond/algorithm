package com.github.algorithm.tree;

import com.github.bean.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Rob {

//    f(t) 以t为根的子树，偷t的最大收益
//    g(t) 以t为根的子树，不偷t的最大收益
//
//    f(t) = g(l) + g(r)
//    g(t) = max(f(l), g(l))  +  max(f(r),g(r))

    private Map<TreeNode, Integer> f = new HashMap<>();
    private Map<TreeNode, Integer> g = new HashMap<>();

    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }

        postOrderTraversal(root);

        return Math.max(f.get(root), g.get(root));
    }

    private void postOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        f.put(root, g.getOrDefault(root.left, 0) + g.getOrDefault(root.right, 0) + root.val);
        g.put(root, Math.max(f.getOrDefault(root.left, 0), g.getOrDefault(root.left, 0)) + Math.max(f.getOrDefault(root.right, 0), g.getOrDefault(root.right, 0)));
    }
}
