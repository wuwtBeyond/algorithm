package com.github.algorithm;

import com.github.bean.TreeNode;

/**
 * @author : wuwentao
 * @date : 2020/4/28
 */
public class Construct_Binary_Search_Tree_from_Preorder_Traversal {

    public TreeNode bstFromPreorder(int[] preorder) {
        if (preorder == null || preorder.length <= 0) return null;

        TreeNode root = recursive(preorder,0,  preorder.length);

        return root;
    }

    /**
     * 设计递归递推式，定义好边界即可 与之前题目类似
     * @param preorder
     * @param left
     * @param right
     * @return
     */
    private TreeNode recursive(int[] preorder, int left, int right) {
        if (left >= right) return null;

        TreeNode node = new TreeNode(preorder[left]);
        int i = left + 1;
        for (;i < right;i ++) {
            if (preorder[i] > preorder[left]) {
                break;
            }
        }

        node.left = recursive(preorder, left+1, i);
        node.right = recursive(preorder, i, right);

        return node;
    }
}
