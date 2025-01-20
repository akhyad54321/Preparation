package com.ganeshaa.practice.ganeshaa;

import java.util.HashSet;

public class C10 {
    public static void main(String[] args) {
        String name = "aeiouaeeibuya";
        HashSet<Character> set = new HashSet<>();

        for (int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            set.add(ch);
        }

        System.out.println(set);
    }
}
