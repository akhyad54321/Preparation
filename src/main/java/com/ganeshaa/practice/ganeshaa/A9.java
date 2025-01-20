package com.ganeshaa.practice.ganeshaa;

public class A9 {//armstrong within range

    public static void main(String[] args) {
        int start = 100;
        int end = 1000;
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isArmstrong(int num){
        int sum = 0;
        int temp = num;
        int length = countLength(num);
        while(num!=0){
            int d = num%10;
            sum = sum + (int)Math.pow(d, length);
            num=num/10;
        }
        if (sum==temp){
            return true;
        }else {
            return false;
        }
    }

    public static int countLength(int num){
        int count = 0;
        while(num!=0){
            int d = num%10;
            num=num/10;
            count++;
        }
        return count;
    }
}
