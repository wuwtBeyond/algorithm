package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class LowestCommonAncestor {

    /**
     * 二叉搜索树
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p ,q);
        }
        if (root.val > p.val && root.val > q.val) {
            return lowestCommonAncestor(root.left, p , q);
        }

        return root;
    }

    private TreeNode res = null;

    /**
     * 二叉树
     * 递归函数定义：ancestor(TreeNode root, TreeNode p, TreeNode q) p或q是否是root的子节点
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        this.postOrderTraversal(root, p , q);

        return this.res;
    }

    private boolean postOrderTraversal(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean lson = postOrderTraversal(root.left, p, q);
        boolean rson = postOrderTraversal(root.right, p, q);
        if ((lson && rson) || ((root.val == p.val || root.val == q.val) && (lson || rson))) {
            res = root;
        }
        return lson || rson || (root.val == p.val || root.val == q.val);
    }
}
