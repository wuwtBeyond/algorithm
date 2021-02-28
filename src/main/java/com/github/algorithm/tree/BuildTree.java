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

    /**
     * 后序遍历和先根遍历构造二叉树1204@LUCKYstar213316
     */
//    private Map<Integer, Integer> inorder_map = new HashMap<>();
//
//    public TreeNode buildTree(int[] inorder, int[] postorder) {
//        if (inorder == null || postorder == null) {
//            return null;
//        }
//        int length = inorder.length;
//        for (int i = 0;i < length;i ++) {
//            inorder_map.put(inorder[i], i);
//        }
//
//        TreeNode root = buildTree(inorder, 0, length-1, postorder, 0 , length-1);
//
//        return root;
//    }
//
//    private TreeNode buildTree(int[] inorder, int in_left, int in_right, int[] postorder, int post_left, int post_right) {
//        if (in_left > in_right) {
//            return null;
//        }
//
//        int root_index = inorder_map.get(postorder[post_right]);
//        int left_size = root_index - in_left;
//        TreeNode root = new TreeNode(inorder[root_index]);
//        root.left = buildTree(inorder, in_left, root_index-1, postorder, post_left, post_left+left_size-1);
//        root.right = buildTree(inorder, root_index+1, in_right, postorder, post_left+left_size, post_right-1);
//        return root;
//    }
}
