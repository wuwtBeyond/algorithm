package com.github;

import com.github.algorithm.*;
import com.github.bean.ListNode;
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
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;

        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(3);

        t2.left = t4;
        t2.right = t5;

//        TreeNode t6 = new TreeNode(5);
//        TreeNode t7 = new TreeNode(7);
//
//        t2.left = t4;
//        t2.right = t5;
//
//        t3.left = t6;
//        t3.right = t7;
//
//        TreeNode t8 = new TreeNode(3);
//        TreeNode t9 = new TreeNode(8);
//
//        t5.right = t8;
//        t7.right = t9;
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

//        Count_Number_of_Teams main = new Count_Number_of_Teams();
//        main.numTeams(new int[]{1,2,3,4});

//        Binary_Search_Tree_to_Greater_Sum_Tree main = new Binary_Search_Tree_to_Greater_Sum_Tree();
//        main.bstToGst(t1);
//        Insert_into_a_Binary_Search_Tree main = new Insert_into_a_Binary_Search_Tree();
//        main.insertIntoBST(t1,0);
//        Encode_and_Decode_TinyURL main = new Encode_and_Decode_TinyURL();
//        main.encode("https://leetcode.com/problems/design-tinyurl");
//        Maximum_Binary_Tree main = new Maximum_Binary_Tree();
//        main.constructMaximumBinaryTree(new int[]{3,2,1,6,0,5});
//        Sort_the_Matrix_Diagonally main = new Sort_the_Matrix_Diagonally();
//        main.diagonalSort(new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}});
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(0);
//        ListNode node3 = new ListNode(0);
//        ListNode node4 = new ListNode(1);
//        ListNode node5 = new ListNode(1);
//
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
//
//        Convert_Binary_Number_in_a_Linked_List_to_Integer main = new Convert_Binary_Number_in_a_Linked_List_to_Integer();
//        main.getDecimalValue(node1);
//        Construct_Binary_Search_Tree_from_Preorder_Traversal main = new Construct_Binary_Search_Tree_from_Preorder_Traversal();
//        main.bstFromPreorder(new int[]{8,5,1,7,10,12});

//        Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram main = new Minimum_Number_of_Steps_to_Make_Two_Strings_Anagram();
//        main.minSteps("gctcxyuluxjuxnsvmomavutrrfb" , "qijrjrhqqjxjtprybrzpyfyqtzf");
//        Reveal_Cards_In_Increasing_Order main = new Reveal_Cards_In_Increasing_Order();
//        main.deckRevealedIncreasing(new int[]{17,13,11,2,3,5,7});
//        Count_Square_Submatrices_with_All_Ones main = new Count_Square_Submatrices_with_All_Ones();
//        main.countSquares(new int[][]{{0,1,1,1},{1,1,1,1},{0,1,1,1}});
//        Queens_That_Can_Attack_the_King mian = new Queens_That_Can_Attack_the_King();
//        mian.queensAttacktheKing(new int[][]{{0,0},{1,1},{2,2},{3,4},{3,5},{4,4},{4,5}}, new int[]{3,3});
//        Reduce_Array_Size_to_The_Half main = new  Reduce_Array_Size_to_The_Half();
//        main.minSetSize(new int[]{3,3,3,3,5,5,5,2,2,7});
//        Find_All_Duplicates_in_an_Array main = new Find_All_Duplicates_in_an_Array();
//        main.findDuplicates(new int[]{4,3,2,7,8,2,3,1});
//        Number_of_Sub_arraysofSize_K_and_Average_Greaterthan main = new Number_of_Sub_arraysofSize_K_and_Average_Greaterthan();
//        main.numOfSubarrays(new int[]{4,2,3,2}, 1, 3);
//        Sum_of_Subarray_Minimums main = new Sum_of_Subarray_Minimums();
//        System.out.println(main.sumSubarrayMins(new int[]{3,1,2,4}));
        Maximum_Subarray main = new Maximum_Subarray();
        main.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});


//        StockSpanner stockSpanner = new StockSpanner();
//        System.out.println(stockSpanner.next(100));
//        System.out.println(stockSpanner.next(80));
//        System.out.println(stockSpanner.next(60));
//        System.out.println(stockSpanner.next(70));
//        System.out.println(stockSpanner.next(60));
//        System.out.println(stockSpanner.next(75));
//        System.out.println(stockSpanner.next(85));

    }
}
