package com.ganeshaa.leetcode.stringg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class S7_49 {
    public static void main(String[] args) {
        S7_49 app = new S7_49();
        List<List<String>> groupedAnagrams = app.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println("groupedAnagrams = " + groupedAnagrams);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> outer = new ArrayList<>();
        String stri = "";
        String strj = "";
        String strip = "";
        String strjp = "";
        for (int i = 0; i < strs.length; i++) {
            List<String> inner = new ArrayList<>();
            for (int j = i + 1; j < strs.length; j++) {

                strip = strs[i];
                strjp = strs[j];
                char[] ci = strip.toCharArray();
                char[] cj = strjp.toCharArray();

                Arrays.sort(ci);
                Arrays.sort(cj);

                stri = String.valueOf(ci);
                strj = String.valueOf(cj);

                System.out.println("stri = " + stri);
                System.out.println("strj = " + strj);
                if (stri.equals(strj)) {
                    inner.add(strj);
                }
            }
            inner.add(stri);
            outer.add(inner);
            inner.clear();
            System.out.println("====================");
        }
        return outer;
    }
}
