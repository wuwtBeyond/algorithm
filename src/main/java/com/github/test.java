package com.github;

import com.github.algorithm.*;
import com.github.bean.TreeNode;

import java.util.TreeSet;

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
//        Sum_of_Nodes_with_Even_Valued_Grandparent main = new Sum_of_Nodes_with_Even_Valued_Grandparent();
//        main.sumEvenGrandparent(t1);

//        int[][] grid = new int[][]{{3, 0, 8, 4},{2, 4, 5, 7},{9, 2, 6, 3},{0, 3, 1, 0}};
//
//        Max_Increase_to_Keep_City_Skyline main = new Max_Increase_to_Keep_City_Skyline();
//        main.maxIncreaseKeepingSkyline(grid);
//
//        TreeSet<Integer> treeSet = new TreeSet<>();

        Count_Number_of_Teams main = new Count_Number_of_Teams();
        main.numTeams(new int[]{1,2,3,4});
    }
}
