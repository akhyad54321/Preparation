package com.ganeshaa.practice.onelasttime;

public class D10Imp {//fibonacci

    public static void main(String[] args) {
        int num = 10;
        int t1 = 0;
        int t2= 1;
        System.out.print(t1 +  " " + t2 + " ");
        for (int i=2; i<num; i++){
            int t3 = t2+t1;
            t1= t2;
            t2 = t3;
            System.out.print(t3 + " ");
        }
    }
}
