package com.ganeshaa.practice.ganeshaa;

public class A7 {//reverse of no

    public static void main(String[] args) {
        int num = 121;
        int temp = num;
        int rev = 0;

        while(num!=0){
            int d = num%10;
            rev= rev*10 + d;
            num=num/10;
        }

        System.out.println("rev = " + rev);
        if (rev == temp){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
