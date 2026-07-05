package com.ganeshaa.TOPICS.Topic3.practice;

import java.util.Scanner;

class AgeException extends RuntimeException{
    AgeException(){
        System.out.println("Age is less");
    }
    AgeException(String msg){
        super(msg);
    }
}
public class ThrowExceptionPractice_05072026 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:  ");
        int age = sc.nextInt();
        if (age < 18){
            throw new AgeException("Maa chuda Nibba");
        }else{
            System.out.println("Voting done:");
        }
    }
}
