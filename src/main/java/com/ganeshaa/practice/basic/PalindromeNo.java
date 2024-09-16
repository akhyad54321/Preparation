package com.ganeshaa.practice.basic;

public class PalindromeNo {
    public static void main(String[] args) {
        int num = 122;
        int temp = num;
        int rev = 0;

        while(num!=0){
            int d = num%10;
            rev = rev * 10 + d;
            num = num / 10;
        }

        System.out.println("rev = " + rev);
    }
}
