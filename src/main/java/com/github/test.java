package com.github;

import com.github.algorithm.Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree;
import com.github.bean.TreeNode;

/**
 * @author : wuwentao
 * @date : 2020/4/14
 */
public class test {

//    static {
//        TreeNode t1 = new TreeNode(7);
//        TreeNode t2 = new TreeNode(4);
//        TreeNode t3 = new TreeNode(3);
//        t1.left = t2;
//        t1.right = t3;
//
//        TreeNode t4 = new TreeNode(6);
//        TreeNode t5 = new TreeNode(19);
//
//        t3.left = t4;
//        t3.right = t5;
//    }

    public static void main(String[] args) {
        Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree main = new Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree();

        TreeNode t1 = new TreeNode(7);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;

        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(19);

        t3.left = t4;
        t3.right = t5;

        main.getTargetCopy(t1, null, t3);


    }
}
