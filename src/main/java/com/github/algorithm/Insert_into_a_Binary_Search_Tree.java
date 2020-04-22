package com.github.algorithm;

import com.github.bean.TreeNode;

/**
 * @author : wuwentao
 * @date : 2020/4/21
 */
public class Insert_into_a_Binary_Search_Tree {

    /**
     * 按自然的逻辑走
     * @param root
     * @param val
     * @return
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        TreeNode p = root;
        while (true) {
            if (p.val < val) {
                if (p.right == null) {
                    TreeNode node = new TreeNode(val);
                    p.right = node;
                    break;
                }else {
                    p = p.right;
                }
            }else {
                if (p.left == null) {
                    TreeNode node = new TreeNode(val);
                    p.left = node;
                    break;
                }else {
                    p = p.left;
                }
            }
        }

        return root;
//        while (p != null && (p.left != null || p.right != null)) {
//            if (p.val < val) {
//                p = p.right;
//            }else {
//                p = p.left;
//            }
//        }
//
//        TreeNode node = new TreeNode(val);
//        if (p == null) {
//            p = root;
//        }
//        if (val > p.val) {
//            p.right = node;
//        }else {
//            p.left = node;
//        }


    }
}
