package com.ganeshaa.practice.basic;

public class SumOfNo {
    public static void main(String[] args) {
        int no = 1234;
        int sum = 0;
        while(no!=0){
            int d = no%10;
            sum = sum + d;
            no = no/10;
        }
        System.out.println(sum);
    }
}
