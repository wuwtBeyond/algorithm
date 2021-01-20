package com.github.algorithm.tree;

import com.github.bean.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class IsCousins {
    private Map<Integer, Integer> depth;
    private Map<Integer, TreeNode> parent;

    public boolean isCousins(TreeNode root, int x, int y) {
        depth = new HashMap<>();
        parent = new HashMap<>();

        preOrderTraversal(root, null);

        return depth.get(x) == depth.get(y) && parent.get(x) != parent.get(y);
    }

    private void preOrderTraversal(TreeNode root, TreeNode par) {
        if (root == null) {
            return;
        }

        depth.put(root.val, par == null ? 0 : depth.get(par.val)+1);
        parent.put(root.val, par);

        preOrderTraversal(root.left, root);
        preOrderTraversal(root.right, root);
    }

}
