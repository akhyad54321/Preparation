package com.ganeshaa.practice.ganeshaa;

import java.util.ArrayList;
import java.util.List;

public class A5 {//Prime within given range
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int start = 10;
        int end = 100;
        for (int i=start; i<=end; i++){
            if (isPrime(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
    public static boolean isPrime(int num){
        for (int i=2; i<num; i++){
            if (num%i==0){
               return false;
            }
        }
        return true;
    }
}
