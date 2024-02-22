package com.ganeshaa.leetcode.stringg;

import java.util.ArrayList;
import java.util.List;

public class S3_2947 {

    public static void main(String[] args) {
        S3_2947 app = new S3_2947();
        List<Integer> integerList = app.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a');
        System.out.println("integerList = " + integerList);
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>(words.length);
        for (int i = 0; i < words.length; i++) {
            String s = words[i];  //aaaa
            if (s.indexOf(x) != -1) {
                list.add(i);
            }
        }
        return list;
    }
    public List<Integer> findWordsContaining1(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<words.length; i++){
            String singleWord = words[i];
            for (int j=0; j<singleWord.length(); j++){
                char charAt = singleWord.charAt(j);
                if (charAt == x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }

}
