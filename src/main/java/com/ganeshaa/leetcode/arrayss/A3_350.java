package com.ganeshaa.leetcode.arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A3_350 {
    public static void main(String[] args) {
        A3_350 test = new A3_350();
        test.intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2});
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<int[]> list1 = Arrays.asList(nums1);
//        List<int[]> list2 = Arrays.asList(nums2);
        List<Integer> target = new ArrayList<>();

        int index = 0;
        for (int i = 0; i < list1.size(); i++) {

            int j = nums2[index];
            if (index < nums2.length) {
                if (list1.indexOf(i) == j) {
                    target.add(j);
                }
            }
            index++;
        }

        System.out.println("target = "+ target);
        return null;
    }

}
