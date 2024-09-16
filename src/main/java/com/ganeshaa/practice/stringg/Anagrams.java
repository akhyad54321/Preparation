package com.ganeshaa.practice.stringg;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";

        if (s1.length() == s2.length()){
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            if (Arrays.equals(ch1, ch2)){
                System.out.println("anagram");
            }
            else {
                System.out.println("not anagram loop 2");
            }
//            String str1 = new String(ch1);
//            String str2 = new String(ch2);
//            if (str1.equals(str2)){
//                System.out.println("anagrams");
//            }else {
//                System.out.println("not anagram loop 2");
//            }

        }else {
            System.out.println("Not anagram loop1");
        }
    }
}
