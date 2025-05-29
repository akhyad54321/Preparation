package com.ganeshaa.practice.onelasttime;

public class D4 {
    public static void main(String[] args) {
        int num = 1;
        boolean value = true;
        for (int i=2; i<num;i++){
            if (num%i==0){
                value=false;
            }
        }
        if (value){
            System.out.println("primeNo = " + num);
        }else{
            System.out.println("Not Prime = " + num);
        }
    }
}
