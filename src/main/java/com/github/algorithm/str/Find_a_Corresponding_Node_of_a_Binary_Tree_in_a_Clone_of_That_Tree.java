package com.github.algorithm.str;


import com.github.bean.TreeNode;

/**
 * @author : wuwentao
 * @date : 2020/4/13
 */
public class Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree {

    private int count = 0;
    private TreeNode res;

    /**
     * 先序遍历到target，记住是第几个节点，从clone同样先序遍历第n个节点
     * @param original
     * @param cloned
     * @param target
     * @return
     */
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        // 递归终止条件
        if (original == target || original == null) {
            return cloned;
        }

        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        // 找到就退出
        if (left != null) {
            return left;
        }

        return getTargetCopy(original.right, cloned.right, target);

//        preOrder(original, target);

//        System.out.println("Test");

//        preOrderTarget(cloned);

//        System.out.println(res.val);
//        return res;
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

    /**
     * 实现先序遍历获取第n个节点
     * @param root
     * @return
     */
    private void preOrderTarget(TreeNode root) {
        if (root == null) return;
        count --;

        if (count == 0) {
            res = root;
            return ;
        }


        preOrderTarget(root.left);
        preOrderTarget(root.right);
    }
}
