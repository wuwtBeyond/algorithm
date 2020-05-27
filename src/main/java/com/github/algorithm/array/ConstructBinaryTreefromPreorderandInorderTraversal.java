package com.github.algorithm.array;

import com.github.bean.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : wuwentao
 * @date : 2020/5/27
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {

    /**
     * 递归思想
     * preorder中每遍历一个点 根据此点在inorder的位置划分左子树和右子树
     *
     * 优化：使用一个map记录inorder数据的value和下标的对应关系，
     * 当遍历到preOrder[i]时，用这个value区找到inOrder对应的下标，左边界到下标即为左子树
     *                                                       下标到右边界即为右子树
     *
     * 左闭右开区间
     *
     * preorder = [3,9,20,15,7]
     * inorder = [9,3,15,20,7]
     * Return the following binary tree:
     *
     *     3
     *    / \
     *   9  20
     *     /  \
     *    15   7
     * @param preOrder
     * @param inOrder
     * @return
     */
    public TreeNode buildTree(int[] preOrder, int[] inOrder) {
        Map<Integer, Integer> inMap = new HashMap<>();
        for (int i = 0;i < inOrder.length;i ++) {
            inMap.put(inOrder[i], i);
        }

        return buildTree(preOrder, 0, preOrder.length-1, inOrder, 0, inOrder.length-1, inMap);
    }

    private TreeNode buildTree(int[] preOrder, int preStart, int preEnd, int[] inOrder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        if (preStart > preEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preOrder[preStart]);

        int inRoot = inMap.get(preOrder[preStart]);
        int numsLeft = inRoot - inStart;


        root.left = buildTree(preOrder, preStart+1, preStart+numsLeft, inOrder, inStart, inRoot-1, inMap);
        root.right = buildTree(preOrder, preStart+numsLeft+1, preEnd, inOrder, inRoot+1, inEnd, inMap);

        return root;
    }
}
