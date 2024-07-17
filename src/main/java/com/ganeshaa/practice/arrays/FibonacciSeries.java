package com.ganeshaa.practice.arrays;

public class FibonacciSeries {
    public static void main(String[] args) {

        int t1 = 0;
        int t2 = 1;
        System.out.println(t1);
        System.out.println(t2);
        int t3;
        for (int i=2; i<10; i++){
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            System.out.println(t3);
        }
    }
}
