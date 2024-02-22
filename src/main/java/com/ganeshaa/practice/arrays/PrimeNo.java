package com.ganeshaa.practice.arrays;

public class PrimeNo {
    public static void main(String[] args) {
        PrimeNo p = new PrimeNo();
        p.primeOrNot(9);
    }
    boolean value = false;
    public void primeOrNot(int num){
        for (int i=2; i<num; i++){
            if (num % i ==0){
                value=true;
            }
        }
        if (value == true){
            System.out.println("Not Prime");
        }else {
            System.out.println("Prime =" + num);
        }
    }
}
