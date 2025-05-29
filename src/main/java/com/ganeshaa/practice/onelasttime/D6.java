package com.ganeshaa.practice.onelasttime;

public class D6 {
    public static void main(String[] args) {
        int num = 1234;
        int sum = 0;

        while(num!=0){
            int d = num%10;
            sum = sum + d;
            num = num / 10;
        }

        System.out.println(sum);
    }
}
