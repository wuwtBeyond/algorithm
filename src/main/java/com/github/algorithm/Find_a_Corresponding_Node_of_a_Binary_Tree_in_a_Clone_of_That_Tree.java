package com.github.algorithm;


import com.github.bean.TreeNode;

/**
 * @author : wuwentao
 * @date : 2020/4/13
 */
public class Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree {

    private int count = 0;

    /**
     * 先序遍历到target，记住是第几个节点，从clone同样先序遍历第n个节点
     * @param original
     * @param cloned
     * @param target
     * @return
     */
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        preOrder(original, target);

        System.out.println("test");

        return null;
    }

    private void preOrder(TreeNode root, TreeNode target) {
        if (root == null) return;

        count ++;
        if (root == target) {
            return;
        }

        preOrder(root.left, target);
        preOrder(root.right, target);
    }
}
