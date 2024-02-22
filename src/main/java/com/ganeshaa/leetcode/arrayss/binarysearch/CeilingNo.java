package com.ganeshaa.leetcode.arrayss.binarysearch;

import java.util.Scanner;

public class CeilingNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CeilingNo b = new CeilingNo();
        System.out.print("Enter the Ceiling Element : ");
        int target = scanner.nextInt();
        int position = b.checkPosition(new int[]{8, 12, 14, 19, 24, 36, 42}, target);
        System.out.println("position = " + position);
    }

    public int checkPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int middle = 0;

        if (target < arr[0] || target > arr[arr.length - 1]) {
            return -1;
        }
        while (start <= end) {
            middle = (start + end) / 2;
            if (start == end) {
                if (target > arr[start]) {
                    return arr[start + 1];
                }
            }
            if (target > arr[middle]) {
                start = middle + 1;
            } else if (target < arr[middle]) {
                end = middle - 1;
            } else {
                return arr[middle];
            }
        }
        System.out.println("Floor Value = " + arr[end]);
        System.out.println("Ceiling Value = " + arr[middle]);
        return arr[middle];
    }

}
