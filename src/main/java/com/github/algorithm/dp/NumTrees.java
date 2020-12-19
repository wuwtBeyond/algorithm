package com.github.algorithm.dp;

import com.github.bean.TreeNode;
import java.util.LinkedList;
import java.util.List;

public class NumTrees {

    /**
     * dp[n] 长度为n的序列构成二叉树的数量
     * f[i, n] 以i为根，序列长度为n的不同二叉搜索树的数量
     * @param n
     * @return
     */
    public int numTrees(int n) {
        int[] f = new int[n+1];

        f[0] = 1;
        f[1] = 1;

        for (int i = 2;i < n+1;i ++) {
            for (int j = 0;j < i;j ++) {
                f[i] += f[j] * f[i-j-1];
            }
        }

        return f[n];
    }

    public List<TreeNode> generateTrees(int n) {
        if (n <= 0) {
            return new LinkedList<>();
        }

        return gen(1, n);
    }

    private List<TreeNode> gen(int start, int end) {
        List<TreeNode> nodes = new LinkedList<>();
        if (start > end) {
            nodes.add(null);
            return nodes;
        }

        for (int i = start;i <= end;i ++) {
            List<TreeNode> left = gen(start, i-1);
            List<TreeNode> right = gen(i+1, end);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode node = new TreeNode(i);
                    node.left = l;
                    node.right = r;
                    nodes.add(node);
                }
            }
        }

        return nodes;
    }

    public static void main(String[] args) {
        NumTrees numTrees = new NumTrees();
//        numTrees.numTrees(3);
        List<TreeNode> res = numTrees.generateTrees(3);
        System.out.println(0);
    }
}
