package com.ganeshaa.practice.ganeshaa;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C13Imp {// Anagrams
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listee";

        if (s1.length() == s2.length()){
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            if (Arrays.equals(c1,c2)){
                System.out.println("ANAGRAM");
            }else{
                System.out.println("Not anagram : loop 2");
            }
        }else {
            System.out.println("Not anagram : loop 1");
        }
    }
}
