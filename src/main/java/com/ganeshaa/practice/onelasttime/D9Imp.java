package com.ganeshaa.practice.onelasttime;

import java.util.ArrayList;
import java.util.List;

public class D9Imp {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int start = 1;
        int end = 1000;
        for (int i=start; i<=end; i++){
            int returnNum = findArmstrong(i);
            if (i==returnNum){
                list.add(i);
            }
        }
        System.out.println(list);
    }

    public static int findArmstrong(int num){
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        int temp = num;
        int length = findLength(num);
        while(num!=0){
            int d = num%10;
            sum = sum + (int)Math.pow(d,length);
            num = num/10;
        }
        return sum;
    }
    public static int findLength(int num){
        int len = 0;
        while(num!=0){
            num = num / 10;
            len++;
        }
        return len;
    }
}
