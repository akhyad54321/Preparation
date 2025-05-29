package com.ganeshaa.practice.onelasttime;

public class D7 {// palindrome

    public static void main(String[] args) {
        int num = 123;
        int rev= 0;
        int temp = num;
        while(num!=0){
            int d = num%10;
            rev = rev*10 + d;
            num = num / 10;
        }
        System.out.println(rev);
    }

}
