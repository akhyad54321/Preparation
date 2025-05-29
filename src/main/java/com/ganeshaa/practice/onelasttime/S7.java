package com.ganeshaa.practice.onelasttime;

public class S7 {//sum of number

    public static void main(String[] args) {
        String str = "akhilesh@12345";
        String s = "";
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                s = s + ch;
            }
        }
        int num = Integer.parseInt(s);
        int sum = 0;
        while(num!=0){
            int d = num%10;
            sum = sum + d;
            num=num/10;
        }
        System.out.println(sum);
    }
}
