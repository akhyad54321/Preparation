package com.ganeshaa.practice.ganeshaa;

public class C7 {
    public static void main(String[] args) {
        String name = "4PREP2INSTAA6";
        String str = "";

        for (int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if (Character.isDigit(ch)){
                str = str + ch;
            }
        }
        int num = Integer.parseInt(str);

        System.out.println("num = " + num);
        int sum = 0;
        while(num!=0){
            int d = num%10;
            sum = sum + d;
            num=num/10;
        }

        System.out.println(sum);
    }
}
