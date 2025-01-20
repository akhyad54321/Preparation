package com.ganeshaa.practice.ganeshaa;

public class C6 {
    public static void main(String[] args) {
        String name = "Akhilesh Yadav";
        String str = "";

        for (int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if (!Character.isSpace(ch)){
                str = str + ch;
            }
        }
        System.out.println(str);

        System.out.println("---------------------");

        String s = "(a+b)=c";
        s = s.replaceAll("[{}()]", "");
        System.out.println(s);
    }
}
