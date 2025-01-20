package com.ganeshaa.practice.ganeshaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B10Imp {// adding 2 integer array in 3rd array
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{10,20,30,40,50};
        int[] arr3 = new int[arr1.length + arr2.length];

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<arr1.length; i++){
            list.add(arr1[i]);
        }

        for (int i=0; i<arr2.length; i++){
            list.add(arr2[i]);
        }
        System.out.println(list);

        for (int i=0; i<list.size(); i++){
            arr3[i] = list.get(i);
        }
        System.out.println("--------------------");
        System.out.println(Arrays.toString(arr3));
    }

//    Type 2
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {10, 20, 30, 40, 50};
//        int[] arr3 = new int[arr1.length + arr2.length];
//
//        // Manually copy elements from arr1 and arr2
//        int index = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            arr3[index++] = arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            arr3[index++] = arr2[i];
//        }
//
//        System.out.println("Combined array: " + Arrays.toString(arr3));
//    }
}
