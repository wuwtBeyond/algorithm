package com.github.algorithm.str;

import com.github.bean.TreeNode;

/**
 * @author : wuwentao
 * @date : 2020/4/17
 */
public class Sum_of_Nodes_with_Even_Valued_Grandparent {

    private int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        dfs(root, null, null);

        return sum;
    }

    /**
     * 将当前节点、父节点、祖父节点的关系递归传递下去
     * @param current
     * @param parent
     * @param grandParent
     */
    private void dfs(TreeNode current, TreeNode parent, TreeNode grandParent) {
        if (current == null) return ;

        if (grandParent != null && grandParent.val % 2 == 0) {
            sum += current.val;
        }

        dfs(current.left, current, parent);
        dfs(current.right, current, parent);
    }


//    private void dfs(TreeNode root, int depth) {
//        if (root == null) return;
//
//        if (depth == grandParentDepth+2) {
//            sum += root.val;
//        }
//
//
//    }
}
