package com.ganeshaa.practice.onelasttime;

import java.util.HashMap;
import java.util.Map;

public class S10 {//frequency with one loop

    public static void main(String[] args) {
        String str = "aeiouaaiepkjaiegepaee";
        char[] ch = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<str.length(); i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i])+1);
            }else{
                map.put(ch[i], 1);
            }
        }
        map.forEach((k,v)-> System.out.println(k + " " + v));
    }
}
