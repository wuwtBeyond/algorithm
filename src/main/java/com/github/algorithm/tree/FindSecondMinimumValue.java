package com.github.algorithm.tree;

import com.github.bean.TreeNode;

public class FindSecondMinimumValue {

    long ans=Long.MAX_VALUE;

    public int findSecondMinimumValue(TreeNode root) {
        if(root==null) return -1;
        int minval=root.val;
        dfs(root,minval);
        if(ans==Long.MAX_VALUE) return -1;
        return (int)ans;
    }

    private void dfs(TreeNode root, int minval) {
        if(root==null) return;
        if(root.val>minval&&root.val<ans)
            ans=root.val;
        dfs(root.left,minval);
        dfs(root.right,minval);
    }
}
