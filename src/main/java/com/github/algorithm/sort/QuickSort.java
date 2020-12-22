package com.github.algorithm.sort;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = new int[]{4, 5, 1, 6, 2, 7, 3, 8};
        quickSort.sort(arr);
        for(int num : arr) {
            System.out.println(num);
        }
    }

    private void sort(int[] arr) {
        if (arr == null || arr.length <= 0) {
            return;
        }
        int len = arr.length;
        quickSort(arr, 0, len-1);
    }

    private void quickSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int mid = partition(arr, left, right);
        quickSort(arr, left, mid);
        quickSort(arr, mid + 1, right);
    }

    private int partition(int[] arr, int left, int right) {
        int temp = arr[left];
        while (right > left) {
            // 先判断基准数和后面的数依次比较
            while (temp <= arr[right] && left < right) {
                --right;
            }
            // 当基准数大于了 arr[right]，则填坑
            if (left < right) {
                arr[left] = arr[right];
                ++left;
            }
            // 现在是 arr[right] 需要填坑了
            while (temp >= arr[left] && left < right) {
                ++left;
            }
            if (left < right) {
                arr[right] = arr[left];
                --right;
            }
        }
        arr[left] = temp;
        return left;
    }
}
