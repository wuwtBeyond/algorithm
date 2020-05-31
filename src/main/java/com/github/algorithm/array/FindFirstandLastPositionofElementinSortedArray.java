package com.github.algorithm.array;

/**
 * @author : wuwentao
 * @date : 2020/5/31
 */
public class FindFirstandLastPositionofElementinSortedArray {

    /**
     * 二分法找到当前值，找不到返回-1，找到后，向左向右找边界
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        int left = 0, right = nums.length-1;

        int[] res = new int[]{-1, -1};
        int index = -1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (nums[mid] == target) {
                index = mid;
                break;
            }else if (nums[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        if (index == -1) {
            return res;
        }

        left = index;
        right = index;
        while (left >= 0 && nums[left] == target) left--;
        while (right <= nums.length-1 && nums[right] == target) right ++;

        res[0] = left+1;
        res[1] = right-1;

        return res;
    }
}
