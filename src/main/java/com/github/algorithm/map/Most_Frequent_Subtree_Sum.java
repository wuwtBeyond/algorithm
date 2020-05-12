package com.github.algorithm.map;

import com.github.bean.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : wuwentao
 * @date : 2020/5/10
 */
public class Most_Frequent_Subtree_Sum {

    private Map<Integer, Integer> frequency = new HashMap<>();

    private int maxFrequency = 0;

    public int[] findFrequentTreeSum(TreeNode root) {
        postTraverse(root);

        List<Integer> res = new ArrayList<>();
        for (int sum : frequency.keySet()) {
            if (frequency.get(sum) == maxFrequency) {
                res.add(sum);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }


    /**
     * 计算每个节点作为根节点的子树和
     * 关键是递归式
     * @param root
     * @return
     */
    private int postTraverse(TreeNode root) {
        if (root == null) return 0;

        int sum = postTraverse(root.left) + postTraverse(root.right) + root.val;

        frequency.put(sum, frequency.getOrDefault(sum, 0)+1);

        maxFrequency = Math.max(frequency.get(sum), maxFrequency);

        return sum;
    }
}
