package com.ganeshaa.practice.onelasttime;

public class D11 {//fact

    public static void main(String[] args) {
        int fact = fact(7);
        System.out.println(fact);
    }

    public static int fact(int num){
        if(num ==0 || num ==1){
            return 1;
        }
        else{
            return num * fact(num-1);
        }
    }
}
