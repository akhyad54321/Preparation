package com.ganeshaa.leetcode.stringg;

public class S4_2114 {
    public static void main(String[] args) {
        S4_2114 app = new S4_2114();
        int max = app.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"});
        System.out.println("Max = " + max);
    }

    public int mostWordsFound(String[] sentences) {
        int maxLen = 0;

        for (String currSent : sentences) {
            int currLen = currSent.split(" ").length;
            System.out.println("currLen = " + currLen);
            if (maxLen < currLen)
                maxLen = currLen;
        }
        return maxLen;
    }


    public int mostWordsFound2(String[] sentences) {
        int max = 0;
        for (String str : sentences) {
            int count = 1;
            for (int j = 0; j < str.length(); j++) {
                char charAt = str.charAt(j);
                if ((int) charAt == 32) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    public int mostWordsFound1(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int count = 1;
            String str = sentences[i];
            for (int j = 0; j < str.length(); j++) {
                char charAt = str.charAt(j);
                if ((int) charAt == 32) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}
