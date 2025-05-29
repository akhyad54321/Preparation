package com.ganeshaa.practice.onelasttime;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D5Imp {
    public static void main(String[] args) {
       int start=1;
       int end = 100;
        List<Integer> primeList = new ArrayList<>();
        List<Integer> notPrimeList = new ArrayList<>();
       for (int i=start; i<=end; i++){
           boolean prime = findPrime(i);
           if (prime){
               primeList.add(i);
           }else{
               notPrimeList.add(i);
           }
       }
        primeList.forEach(i-> System.out.println(i));

    }
   public static boolean findPrime(int num){
        boolean value = true;
        for(int i=2; i<=num; i++){
            if (num%i==0){
                value = false;
            }
        }
        return value;
    }

}
