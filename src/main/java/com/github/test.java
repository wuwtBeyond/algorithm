package com.github;

import com.github.algorithm.Deepest_Leaves_Sum;
import com.github.algorithm.Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree;
import com.github.algorithm.Group_the_People_Given_the_Group_Size_They_Belong_To;
import com.github.algorithm.Sum_of_Nodes_with_Even_Valued_Grandparent;
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
//        Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree main = new Find_a_Corresponding_Node_of_a_Binary_Tree_in_a_Clone_of_That_Tree();
//
        TreeNode t1 = new TreeNode(6);
        TreeNode t2 = new TreeNode(4);
        TreeNode t3 = new TreeNode(3);
        t1.left = t2;
        t1.right = t3;

        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(19);

        t3.left = t4;
        t3.right = t5;
//          6
//       4    3
//          6   19
//        System.out.println(main.getTargetCopy(t1, t1, t5).val);

//        Group_the_People_Given_the_Group_Size_They_Belong_To main = new Group_the_People_Given_the_Group_Size_They_Belong_To();
//        main.groupThePeople(new int[]{2,2,1,1,1,1,1,1});
//        Deepest_Leaves_Sum main = new Deepest_Leaves_Sum();
//        main.deepestLeavesSum(t1);
        Sum_of_Nodes_with_Even_Valued_Grandparent main = new Sum_of_Nodes_with_Even_Valued_Grandparent();
        main.sumEvenGrandparent(t1);
    }
}
