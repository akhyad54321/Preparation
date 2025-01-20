package com.ganeshaa.practice.ganeshaa;

public class A4 { //Prime No:
    public static void main(String[] args) {
        int num = 11;
        boolean value = false;

        for (int i=2; i<num; i++){
            if (num%i==0){
                value = true;
            }
        }
        if (value){
            System.out.println("Not prime");
        }else{
            System.out.println("Prime");
        }
    }
}
