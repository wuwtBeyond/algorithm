package com.github.algorithm.divide;

import java.util.LinkedList;
import java.util.List;

public class MajorityElement {
    // 摩尔计数法

    /**
     * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
     *
     * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
     *
     * @param nums
     * @return
     */
    public int majorityElement1(int[] nums) {
        int can = 0, count = 0;
        for (int num : nums) {
            if (num == can) {
                count ++;
            } else {
                if (count > 0) {
                    count --;
                } else {
                    can = num;
                }
            }
        }

        return can;
    }

    /**
     * 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
     *
     * 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1)的算法解决此问题。
     *
     * 候选集最多有两个
     *
     * @param nums
     * @return
     */
    public List<Integer> majorityElement2(int[] nums) {
        int can1 = 0, count1 = 0;
        int can2 = 0, count2 = 0;

        for (int num : nums) {
            if (num == can1) {
                count1 ++;
                continue;
            }
            if (num == can2) {
                count2 ++;
                continue;
            }
            if (count1 == 0) {
                can1 = num;
                count1 ++;
                continue;
            }
            if (count2 == 0) {
                can2 = num;
                count2 ++;
                continue;
            }

            count1 --;
            count2 --;
        }

        count1 = count2 = 0;
        for (int num : nums) {
            if (num == can1) {
                count1 ++;
            } else if(num == can2) {
                count2 ++;
            }
        }
        List<Integer> res = new LinkedList<>();
        int len = nums.length;
        if (count1 > len/3) {
            res.add(count1);
        }
        if (count2 > len/3) {
            res.add(count2);
        }

        return res;
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
//        int res = majorityElement.majorityElement(new int[]{2});
//        System.out.println(res);
        List<Integer> res = majorityElement.majorityElement2(new int[]{1,1,4,3,3,2,2,2});
        System.out.println(res);
    }
}
