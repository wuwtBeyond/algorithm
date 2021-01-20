package com.github.algorithm.tree;

import com.github.bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class FindMode {

    private int base = Integer.MAX_VALUE;
    private List<Integer> res = new LinkedList<>();

    private int count = 0;
    private int max_count = 0;

    public int[] findMode(TreeNode root) {
        inOrderTraversal(root);

        int[] resArray = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArray[i] = res.get(i);
        }
        return resArray;
    }

    private void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);

        if (root.val == base) {
            count ++;
        } else {
            count = 1;
            base = root.val;
        }

        if (count == max_count) {
            res.add(base);
        }
        if (count > max_count) {
            max_count = count;
            res.clear();
            res.add(base);
        }

        inOrderTraversal(root.right);
    }
}
