package com.ganeshaa.leetcode.stringg;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class S6_1859 {
    public static void main(String[] args) {
        S6_1859 app = new S6_1859();
        String target = app.sortSentence("is2 sentence4 This1 a3");
        System.out.println("Target = " + target);
    }
    public String sortSentence(String string) {
        Map<Integer, String> map = new HashMap<>();

        String[] split = string.split(" ");
        for (String str: split){
            Integer key = Integer.parseInt(str.substring(str.length() - 1));
            String value = str.substring(0, str.length() - 1);
            map.put(key, value);
        }
        return String.join(" ", map.values().stream().collect(Collectors.toList())).toString();
    }
}
