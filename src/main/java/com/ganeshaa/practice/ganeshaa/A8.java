package com.ganeshaa.practice.ganeshaa;

public class A8 {//armstrong no
    public static void main(String[] args) {
        int num = 153;
        int sum = 0;

        while(num!=0){
            int d = num%10;
            sum = sum + d*d*d;
            num=num/10;
        }

        System.out.println("sum = " + sum);
    }
}
