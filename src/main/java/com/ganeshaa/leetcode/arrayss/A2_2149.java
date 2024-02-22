package com.ganeshaa.leetcode.arrayss;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A2_2149 {
    public static void main(String[] args) {
        A2_2149 test = new A2_2149();
        int[] rearrangedArray = test.rearrangeArray(new int[]{3, 1, -2, -5, 2, -4});
        System.out.println("rearrangedArray = " + Arrays.toString(rearrangedArray));
    }

    public int[] rearrangeArray(int[] arr) {
        List<Integer> targetList = new ArrayList<>();
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }
        for (int j = 0; j < positive.size(); j++) {
            targetList.add(positive.get(j));
            targetList.add(negative.get(j));
        }
        int[] array = new int[targetList.size()];
        for (int i = 0; i < targetList.size(); i++) {
            array[i] = targetList.get(i);
        }
        return array;
    }
}
