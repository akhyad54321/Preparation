package com.ganeshaa.practice.basic;

public class ArmstrongNo {
    public static void main(String[] args) {
        int num =159;
        int sum = 0;
        int temp = num;
        while (num!=0){
            int d = num%10;
            sum = sum+d*d*d;
            num = num / 10;
        }
        System.out.println("sum = " + sum);
    }
}
