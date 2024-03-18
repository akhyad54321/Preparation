package com.ganeshaa.leetcode.stringg;

import java.util.Map;
import java.util.TreeMap;

public class S8_1528 {
    public static void main(String[] args) {
        S8_1528 app = new S8_1528();
        String restoredString = app.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        System.out.println("restoredString = " + restoredString);
    }
    public String restoreString(String s, int[] indices) {

        Map<String, Integer> map = new TreeMap<>();

//        String str = "";
//        for (int i=0; i<s.length(); i++){
//            for (int j=0; j<indices.length; j++){
//                char c = s.charAt(indices[j]);
//                str = str + str.charAt(indices[j]);
//            }
//        }
//        return  str;
        return null;
    }

}
