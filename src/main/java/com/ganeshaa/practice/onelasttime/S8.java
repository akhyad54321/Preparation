package com.ganeshaa.practice.onelasttime;

import java.util.Arrays;

public class S8 {//anagram

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listes";

        if (s1.length() == s2.length()){
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2)){
                System.out.println("ANAGRAM");
            }else{
                System.out.println("Not Anagram : Loop2");
            }
        }else{
            System.out.println("Not Anagram : Loop1");
        }
    }
}
