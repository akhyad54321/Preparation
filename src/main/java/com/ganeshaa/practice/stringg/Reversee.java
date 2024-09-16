package com.ganeshaa.practice.stringg;

public class Reversee {
    public static void main(String[] args) {
        String str = "akhilesh";
        String rev = "";
        for (int i=0; i<str.length(); i++){
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);
    }
}
