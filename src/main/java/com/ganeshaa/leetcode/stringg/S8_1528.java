package com.ganeshaa.leetcode.stringg;

import java.util.Arrays;
import java.util.Optional;

public class S8_1528 {
    public static void main(String[] args) {
        S8_1528 app = new S8_1528();
        String restoredString = app.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        System.out.println("restoredString = " + restoredString);
    }
    public String restoreString(String s, int[] indices) {
        String[] str = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            str[indices[i]] = String.valueOf(s.charAt(i));
        }
        return String.join("", str);
    }

}
