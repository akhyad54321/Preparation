package com.ganeshaa.practice.onelasttime;

public class S5 {//REVERSE

    public static void main(String[] args) {
        String name = "akhilesh";
        String rev = "";

        for (int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }
}
