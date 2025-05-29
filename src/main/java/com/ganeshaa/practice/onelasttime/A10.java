package com.ganeshaa.practice.onelasttime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A10 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2,3,4,5,6};
        int[] arr2 = new int[]{10,20,30,40};
        int[] arr3 = new int[arr1.length + arr2.length];
//        type2
        int count = 0;
        for (int i=0; i<arr1.length; i++){
            arr3[count] = arr1[i];
            count++;
        }
        for (int i=0; i<arr2.length; i++){
            arr3[count] = arr2[i];
            count++;
        }

        System.out.println(Arrays.toString(arr3));

//        type1:
//        List<Integer> list = new ArrayList<>();
//
//        for (int i=0; i<arr1.length; i++){
//            list.add(arr1[i]);
//        }
//        for (int i=0; i<arr2.length; i++){
//            list.add(arr2[i]);
//        }
//
//        System.out.println(list);
//
//        for (int i=0; i<list.size(); i++){
//            arr3[i] = list.get(i);
//        }
//        System.out.println(Arrays.toString(arr3));

    }
}
