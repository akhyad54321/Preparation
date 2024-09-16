package com.ganeshaa.practice.basic;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("REnter the nO");
        int no = sc.nextInt();

        boolean b = false;

        for (int i=2; i<no; i++){
            if (no%i==0){
                b=true;
            }
        }
        if (b){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}
