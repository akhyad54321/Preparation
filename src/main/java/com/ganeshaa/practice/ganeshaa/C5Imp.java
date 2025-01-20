package com.ganeshaa.practice.ganeshaa;

public class C5Imp {// reverse

    public static void main(String[] args) {
        String name = "nitin";
        String rev = "";

        for (int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            rev = ch + rev;
        }

        System.out.println(rev);
        if (name.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
