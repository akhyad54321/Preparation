package com.ganeshaa.practice.ganeshaa;

public class A11 {//fact
    public static void main(String[] args) {
        int fact = isFact(4);
        System.out.println("fact = " + fact);
    }
    public static int isFact(int num){
        if (num == 0 || num == 1){
            return 1;
        }else{
            return num * isFact(num-1);
        }
    }
}
