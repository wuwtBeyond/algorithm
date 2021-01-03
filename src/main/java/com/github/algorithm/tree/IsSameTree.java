package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class IsSameTree {

    /**
     * 给定两个二叉树，编写一个函数来检验它们是否相同。
     *
     * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
     *
     * 示例 1:
     *
     * 输入:       1         1
     *           / \       / \
     *          2   3     2   3
     *
     *         [1,2,3],   [1,2,3]
     *
     * 输出: true
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/same-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param left
     * @param right
     * @return
     */
    /**
     * 递归函数定义：判断以left为根的树和以root为根的树是否相同
     * @param left
     * @param right
     * @return
     */
    public boolean isSameTree(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            if (left.val == right.val) {
                return isSameTree(left.left, right.left) && isSameTree(left.right, right.right);
            } else {
                return false;
            }
        } else if (left == null && right == null) {
            return true;
        } else {
            return false;
        }
    }

}
