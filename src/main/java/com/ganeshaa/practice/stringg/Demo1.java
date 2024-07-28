package com.ganeshaa.practice.stringg;

public class Demo1 {
    public static void main(String[] args) {

        String name = "AkhileSH YAdav";
        String rev = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (Character.isUpperCase(ch)) {
                rev = rev + Character.toUpperCase(ch);
            }
        }
        System.out.println("rev = " + rev);
    }
}
