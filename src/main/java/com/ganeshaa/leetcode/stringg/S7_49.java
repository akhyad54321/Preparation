package com.ganeshaa.leetcode.stringg;

import java.util.*;

public class S7_49 {
    public static void main(String[] args) {
        S7_49 app = new S7_49();
        List<List<String>> groupedAnagrams = app.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        System.out.println("groupedAnagrams = " + groupedAnagrams);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = String.valueOf(chars);
            if (!map.containsKey(sortedStr))
                map.put(sortedStr, new ArrayList<>());
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }

//    public List<List<String>> groupAnagrams(String[] strs) {
//        List<List<String>> outer = new ArrayList<>();
//        String stri = "";
//        String strj = "";
//        String str1 = "";
//        String str2 = "";
//        for (int i = 0; i < strs.length; i++) {
//            boolean value = false;
//            List<String> inner = new ArrayList<>();
//
//            for (int j = i + 1; j < strs.length; j++) {
//                stri = strs[i];
//                strj = strs[j];
//
//                char[] ci = stri.toCharArray();
//                char[] cj = strj.toCharArray();
//
//                Arrays.sort(ci);
//                Arrays.sort(cj);
//
//                str1 = String.valueOf(ci);
//                str2 = String.valueOf(cj);
//
//                if (str1.equals(str2)) {
//                    value = true;
//                    inner.add(strj);
//                }
//            }
//
//            if (value) {
//                inner.add(stri);
//            }
//            if (!inner.isEmpty()) {
//                if (!outer.contains(inner)) {
//                    outer.add(inner);
//                }
//            }
//        }
//
//        return outer;
//    }
}
//1528