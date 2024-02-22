package com.ganeshaa.practice.stringg;

public class StringReference {
    public static void main(String[] args) {
        String name = "Akhilesh Yadav";
        String s = changeName(name);
        System.out.println("name = " + s);
    }

    public static String changeName(String naam){
        naam = "Akash Kesarwani";
        return naam;
    }
}
