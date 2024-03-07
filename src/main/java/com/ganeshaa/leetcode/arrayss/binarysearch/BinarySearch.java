package com.ganeshaa.leetcode.arrayss.binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {25, 27, 29, 34, 37, 38, 38, 47, 54, 89};
        BinarySearch b = new BinarySearch();
        int position = b.checkPosition(arr, 88);
        System.out.println("position = " + position);
    }

    public int checkPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int middle = 0;
        while (start <= end) {
            middle = (start + end) / 2;
            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return middle;
            }
        }
        System.out.println("start = " + start);
        System.out.println("end = " + end);
        System.out.println("middle = " + middle);
        return -1;
    }
}
