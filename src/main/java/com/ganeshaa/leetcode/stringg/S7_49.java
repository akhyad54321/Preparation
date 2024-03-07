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
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < strs.length; i++) {
            boolean value = false;
            List<String> inner = new ArrayList<>();
            for (int j = i + 1; j < strs.length; j++) {
                stri = strs[i];
                strj = strs[j];

                char[] ci = stri.toCharArray();
                char[] cj = strj.toCharArray();

                Arrays.sort(ci);
                Arrays.sort(cj);

                str1 = String.valueOf(ci);
                str2 = String.valueOf(cj);

                if (str1.equals(str2)) {
                    value = true;
                    inner.add(strj);
                }
            }
            if (value){
                inner.add(stri);
            }
            if (!inner.isEmpty()){
                outer.add(inner);
            }
        }
        return outer;
    }
}
