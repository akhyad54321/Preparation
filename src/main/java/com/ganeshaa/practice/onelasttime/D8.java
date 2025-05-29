package com.ganeshaa.practice.onelasttime;

public class D8 {//armstrong

    public static void main(String[] args) {
        int num = 154;
        int sum = 0;
        int temp = num;

        while(num!=0){
            int d = num % 10;
            sum = sum + d*d*d;
            num = num / 10;
        }
        System.out.println(sum);
    }

}
