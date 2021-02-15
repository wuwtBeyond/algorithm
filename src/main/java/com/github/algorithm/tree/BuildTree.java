package com.github.algorithm.tree;

import com.github.bean.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class BuildTree {
    private Map<Integer, Integer> indexMap = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length <= 0 || inorder.length <= 0) {
            return null;
        }
        for (int i = 0; i < inorder.length; i++) {
            indexMap.put(inorder[i], i);
        }
        return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }

    /**
     * 构造
     * 先跟序列为preorder[preleft...preright]
     * 中跟序列为inorder[inleft...inright]
     * 的二叉树
     * 其中，preorder[preleft]是当前节点
     * @param preorder
     * @param preleft
     * @param preright
     * @param inorder
     * @param inleft
     * @param inright
     * @return
     */
    private TreeNode buildTree(int[] preorder, int preleft, int preright, int[] inorder, int inleft, int inright) {
        if (preleft > preright) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[preleft]);
        int index = indexMap.get(preorder[preleft]);
        int leftSize = index - inleft;
        node.left = buildTree(preorder, preleft+1, preleft+leftSize, inorder, inleft, index-1);
        node.right = buildTree(preorder, preleft+leftSize+1, preright, inorder, index+1, inright);
        return node;
    }
}
