package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class IsSubtree {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false;
        }

        if (isSameTree(s, t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);

    }

    /**
     * 递归函数定义：判断以s为根
     * @param s
     * @param t
     * @return
     */
    private boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s != null && t != null) {
            if (s.val == t.val) {
                return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
            }
            return false;
        }

        return false;
    }

}
