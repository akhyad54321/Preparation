package com.ganeshaa.practice.stringg;

import java.util.ArrayList;

public class NotAFibonacciSeries {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        int t1 = 0;
        int t2 = 1;
        list.add(t1);
        list.add(t2);
        for (int i=2; i<=100; i++){
            int t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
            if (t3 > 100){
                break;
            }
            list.add(t3);
        }

        System.out.println("Fibonacci Series are = " + list);
        for (int j=0; j<=100; j++){
            if (!list.contains(j)){
                list1.add(j);
            }
        }

        System.out.println("Not are + " + list1);
    }
}
