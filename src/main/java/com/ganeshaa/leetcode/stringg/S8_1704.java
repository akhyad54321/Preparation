package com.ganeshaa.leetcode.stringg;

import java.util.List;

public class S8_1704 {
    public static void main(String[] args) {
        S8_1704 app = new S8_1704();
        boolean halves = app.halvesAreAlike("book");
        System.out.println("halves =" + halves);
    }

    public boolean halvesAreAlike(String s) {
        int count1 = 0;
        int count2 = 0;
        List<Character> characterList = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        for (int i = 0; i < s.length() / 2; i++) {
            if (characterList.contains(s.charAt(i))) {
                count1++;
            }
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            if (characterList.contains(s.charAt(i))) {
                count2++;
            }
        }
        return count1 == count2;
    }
    public boolean halvesAreAlike1(String s) {
        int count1 = 0;
        int count2 = 0;
        List<Character> characterList = List.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');

        for (int i = 0; i < s.length() / 2; i++) {
            if (characterList.contains(s.charAt(i))) {
                count1++;
            }
        }
        for (int i = s.length() / 2; i < s.length(); i++) {
            if (characterList.contains(s.charAt(i))) {
                count2++;
            }
        }
        return count1 == count2;
    }

}
