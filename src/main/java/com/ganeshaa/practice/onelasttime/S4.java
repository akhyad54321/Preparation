package com.ganeshaa.practice.onelasttime;

public class S4 {//toggle

    public static void main(String[] args) {
        String name = "akhiLESH";
        String str = "";

        for (int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if (Character.isUpperCase(ch)){
                str = str + Character.toLowerCase(ch);
            }else{
                str = str + Character.toUpperCase(ch);
            }
        }
        System.out.println(str);
    }
}
