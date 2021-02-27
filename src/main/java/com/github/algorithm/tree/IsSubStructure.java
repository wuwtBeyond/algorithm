package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class IsSubStructure {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }

        if (hasSubStructure(A, B)) {
            return true;
        }

        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean hasSubStructure(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        } else {
            if (A == null || A.val != B.val) {
                return false;
            }
            return hasSubStructure(A.left, B.left) && hasSubStructure(A.right, B.right);
        }
    }
}
