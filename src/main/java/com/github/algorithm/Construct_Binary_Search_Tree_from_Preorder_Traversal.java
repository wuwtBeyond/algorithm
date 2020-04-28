package com.github.algorithm;

import com.github.bean.TreeNode;

/**
 * @author : wuwentao
 * @date : 2020/4/28
 */
public class Construct_Binary_Search_Tree_from_Preorder_Traversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null || preorder.length <= 0) return null;

        TreeNode root = recurive(preorder, 0, preorder.length);

        return root;
    }

    private TreeNode recurive(int[] preorder, int left, int right) {



        return null;
    }
}
