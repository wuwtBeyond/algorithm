package com.github;

/**
 * @author : wuwentao
 * @date : 2020/4/14
 */
public class Test {

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,4,7,6,8,5};
        Test test = new Test();
        test.quickSort(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public void quickSort(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return;
        }
        int len = nums.length;
        quickSort(nums, 0, len-1);
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = partition(nums, left, right);
        quickSort(nums, left, mid);
        quickSort(nums, mid+1, right);
    }

    /**
     * 按nums[left]划分
     * @param nums
     * @param left
     * @param right
     * @return
     */
    private int partition(int[] nums, int left, int right) {
        while (left < right) {
            while (left < right && nums[right] >= nums[left]) {
                right --;
            }
            if (left < right) {
                swap(nums, left, right);
                right --;
                left ++;
            }
            while (left < right && nums[left] <= nums[right]) {
                left ++;
            }
            if (left < right) {
                swap(nums, left, right);
                right --;
                left ++;
            }
        }

        return left;
    }

    private void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
