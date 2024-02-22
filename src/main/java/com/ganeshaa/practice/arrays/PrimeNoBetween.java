package com.ganeshaa.practice.arrays;

import org.apache.catalina.LifecycleState;

import java.util.ArrayList;
import java.util.List;

//Prime no between 1 to 100:
public class PrimeNoBetween {
    public static void main(String[] args) {
        PrimeNoBetween p1 = new PrimeNoBetween();
        List<Integer> primeList = p1.hello();
        System.out.println("PrimeNo = " + primeList);
    }
    public List<Integer> hello(){
        List<Integer> primeNoList = new ArrayList<>();

        for (int i=1; i<=100; i++){
            boolean value = false;

            for (int j=2; j<i; j++){
                if (i%j==0){
                   value = true;
                }
            }
            if (value==false){
                primeNoList.add(i);
            }
        }
        return primeNoList;
    }
}
