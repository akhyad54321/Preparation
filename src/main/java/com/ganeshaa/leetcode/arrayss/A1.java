package com.ganeshaa.leetcode.arrayss;

public class A1 {
    public static void main(String[] args) {
        A1 t1 = new A1();
        t1.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
    }

    public int[] shuffle(int[] arr, int n) {
        int length = arr.length;
        System.out.println("length= " + arr.length);
        System.out.println("---------------------------------");
        int temp;
        int halfLength;
        int[] target = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            halfLength = arr.length / 2;
            target[i] = arr[i];
            target[i] = arr[halfLength];
            halfLength++;
        }

        for (int i = 0; i < target.length; i++) {
            System.out.println(target[i]);
        }

        return null;
    }
}
