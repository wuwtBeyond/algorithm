package com.github.algorithm;

import com.github.bean.TreeNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author : wuwentao
 * @date : 2020/5/6
 */
public class FindElements {

    private Set<Integer> values;

    public FindElements(TreeNode root) {
        values = new HashSet<>();
        construct(root, 0);

    }

    private void construct(TreeNode root, int val) {
        if (root == null) return;

        root.val = val;
        values.add(val);

        construct(root.left, 2*val+1);
        construct(root.right, 2*val+2);
    }

    public boolean find(int target) {

        return values.contains(target);
    }

}
