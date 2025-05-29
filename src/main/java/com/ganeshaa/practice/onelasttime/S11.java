package com.ganeshaa.practice.onelasttime;

import java.util.HashSet;
import java.util.Set;

public class S11 {//remove duplicate

    public static void main(String[] args) {
        String str = "aeiouaaiepkjaiegepaee";
        Set<Character> set = new HashSet<>();
        char[] ch = str.toCharArray();
        for (int i=0; i<str.length(); i++){
            set.add(ch[i]);
        }
        System.out.println(set);
    }
}
