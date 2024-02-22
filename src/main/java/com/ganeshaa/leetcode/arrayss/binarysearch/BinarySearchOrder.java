package com.ganeshaa.leetcode.arrayss.binarysearch;

import java.util.Scanner;

public class BinarySearchOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the target Element : ");
        int target = scanner.nextInt();
        BinarySearchOrder searchOrder = new BinarySearchOrder();
        int checkedPosition = searchOrder.checkPosition(new int[]{12, 13, 15, 17, 19, 21, 25, 27, 29, 34, 37}, target);
//        int checkedPosition = searchOrder.checkPosition(new int[]{89, 85, 81, 78, 74, 71, 64, 60}, target);
        System.out.println("checkedPosition = " + checkedPosition);
    }

    public int checkPosition(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean asc =  arr[0]< arr[arr.length-1];

        while (start <= end){
            int middle = (start + end)/2;
            if (target == arr[middle]){
                return middle;
            }
            if (asc){
                if (target > arr[middle]){
                    start = middle+1;
                }else {
                    end = middle-1;
                }
            }else {
                if (target > arr[middle]){
                    end = middle-1;
                }else {
                    start = middle+1;
                }
            }
        }
        return -1;
    }
}
