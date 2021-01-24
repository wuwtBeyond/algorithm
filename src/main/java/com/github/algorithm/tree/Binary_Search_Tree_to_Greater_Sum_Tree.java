package com.github.algorithm.tree;

import com.github.bean.TreeNode;

/**
 * @author : wuwentao
 * @date : 2020/4/20
 */
public class Binary_Search_Tree_to_Greater_Sum_Tree {

    private int sum = 0;

    public TreeNode bstToGst(TreeNode root) {

        dfs(root);

        return root;
    }

    /**
     * 根据bfs的特点，先从右子节点搜索
     * @param current
     */
    private void dfs(TreeNode current) {
        if (current == null) return;

        dfs(current.right);

        sum += current.val;
        current.val = sum;

        dfs(current.left);
    }


}
