package com.ganeshaa.leetcode.arrayss.binarysearch;

public class BS1_852  {
    public static void main(String[] args) {
        BS1_852 b1 = new BS1_852();
        int peaked = b1.peakIndexInMountainArray(new int[]{0,10,5,2});
        System.out.println("peaked = " + peaked);
    }
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1, mid;
        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid] < arr[mid + 1])
                start = mid + 1;
            else
                end = mid;
        }
        return start;
    }
    
}
