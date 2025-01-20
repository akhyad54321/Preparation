package com.ganeshaa.practice.ganeshaa;

import java.util.HashSet;

public class C12Imp {
    public static void main(String[] args) {
        String name = "aeiouaeeibuya";
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> duplicates = new HashSet<>();

        for (int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if (!set.add(ch)){
                duplicates.add(ch);
            }
        }
        System.out.println(duplicates);
    }
}
