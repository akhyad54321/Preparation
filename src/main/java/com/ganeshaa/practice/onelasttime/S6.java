package com.ganeshaa.practice.onelasttime;

public class S6 {//palindrome

    public static void main(String[] args) {
        String name = "nitin";
        String rev = "";
        for (int i= name.length()-1; i>=0; i--){
            char ch = name.charAt(i);
            rev = rev + ch;
        }
        System.out.println(rev);

        if(name.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
