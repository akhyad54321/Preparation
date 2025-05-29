package com.ganeshaa.practice.onelasttime;

import java.util.HashSet;
import java.util.Set;

public class S12 {
    public static void main(String[] args) {
        String str = "aeiouaaiepkjaiegepaee";
        Set<Character> set = new HashSet<>();
        Set<Character> notSet = new HashSet<>();
        char[] ch = str.toCharArray();
        for (int i=0; i<str.length(); i++){
            if (!set.add(ch[i])){
                notSet.add(ch[i]);
            }
        }
        System.out.println(set);
        System.out.println(notSet);
    }
}
