package com.ganeshaa.leetcode.stringg;

public class S6_58 {
    public static void main(String[] args) {
        S6_58 s1 = new S6_58();
        int lengthedOfLastWord = s1.lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println("length = " + lengthedOfLastWord);
    }
    public int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        String lastWord = str[str.length - 1];
        return lastWord.length();
    }
}
