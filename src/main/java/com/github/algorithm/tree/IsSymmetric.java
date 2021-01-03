package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class IsSymmetric {

    /**
     * 给定一个二叉树，检查它是否是镜像对称的。
     *
     *  
     *
     * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
     *
     *     1
     *    / \
     *   2   2
     *  / \ / \
     * 3  4 4  3
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/symmetric-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return preOrderIsSymmetric(root.left, root.right);
    }

    /**
     * 递归函数定义：左子树left和右子树right是否是对称的
     * @param left
     * @param right
     * @return
     */
    private boolean preOrderIsSymmetric(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            if (left.val == right.val) {
                return preOrderIsSymmetric(left.left, right.right) && preOrderIsSymmetric(left.right, right.left);
            }else {
                return false;
            }
        } else if (left == null && right == null) {
            return true;
        } else {
            return false;
        }

//        if (left == null && right == null) {
//            return true;
//        }



    }


}
