package com.ganeshaa.practice.stringg;

public class VowelConsonent {
    public static void main(String[] args) {

        String s = "AKHilesh";
        String str = s.toLowerCase();
        String vowel = "";
        String con = "";

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowel = vowel + str.charAt(i);
            }else {
                con = con + str.charAt(i);
            }
        }

        System.out.println("vowel = " + vowel);
        System.out.println("con = " + con);
    }
}
