package com.ganeshaa.practice.ganeshaa;

public class A10 {//fibonacci
    public static void main(String[] args) {
        int num = 10;
        int t1 = 0;
        int t2 = 1;
        System.out.print(t1 + " " + t2);
        for (int i=2; i<num; i++){
            int t3 = t1+t2;
            t1=t2;
            t2=t3;
            System.out.print(" " + t3 + " ");
        }
    }
}
