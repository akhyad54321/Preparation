 package com.ganeshaa.practice.arrays;

import java.util.ArrayList;
import java.util.List;

//Find Armstrong no between 100 to 1000:

public class ArmstrongNo {
    public static void main(String[] args) {
        System.out.println("hello");
        List<Integer> armstrongNo = checkNumber();
        System.out.println("armstrongNo = " + armstrongNo);
    }

    public static List<Integer> checkNumber(){
        List<Integer> list = new ArrayList<>();
        for ( int i=100; i<=1000; i++){
            int sum=0;
            int temp = i;
            while (temp!=0){
                int digit = temp%10;
                sum = sum + digit * digit * digit;
                temp = temp/10;
            }
            if (i==sum){
                list.add(i);
            }
        }
        return list;
    }
}
