package com.ganeshaa.practice.arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class SecondLargestNo {
    public static void main(String[] args) {

        int[] arr = new int[]{2,4,6,8,10};
        System.out.println("-----------------------------");
        OptionalInt optionalInt = Arrays.stream(arr).distinct().sorted().skip(1).findFirst();
        System.out.println("optionalInt = " + optionalInt);
    }
}
