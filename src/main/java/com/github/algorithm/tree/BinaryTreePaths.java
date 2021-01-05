package com.github.algorithm.tree;

import com.github.bean.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new LinkedList<>();
        preOrderPath(root, new StringBuilder(), res);

        return res;
    }

    /**
     * 递归函数定义 ： 先序遍历
     * @param root
     * @param path
     * @param res
     */
    private void preOrderPath(TreeNode root, StringBuilder path, List<String> res) {
        if (root == null) {
            return ;
        }

        int length = path.length();
        path.append(root.val);
        if (root.left == null && root.right == null) {
            res.add(new String(path));
        }
        path.append("->");
        preOrderPath(root.left, path, res);
        preOrderPath(root.right, path, res);

        path.delete(length, path.length());
    }
}
