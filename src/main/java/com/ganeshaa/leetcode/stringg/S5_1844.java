package com.ganeshaa.leetcode.stringg;

public class S5_1844 {
    public static void main(String[] args) {
        S5_1844 app = new S5_1844();
        String target = app.replaceDigits("a1b2c3d4e");
    }

    public String replaceDigits(String str) {
        String target = "";
        int j = 1;
        for (int i = 0; i < str.length(); i = i + 2) {
            target = target + str.charAt(i);
                int jValue = Integer.parseInt(String.valueOf(str.charAt(j)));
                int ascii = (int) str.charAt(i) + jValue;
                target = target + Character.toString(ascii);
            if (j < str.length()) {
                j = j + 2;
            }
        }
        return target;
    }
//    public String replaceDigits(String str) {
//        String target = "";
//        int j = 1;
//        for (int i = 0; i < str.length(); i = i + 2) {
//            target = target + str.charAt(i);
//            if (j < str.length()) {
//                int jValue = Integer.parseInt(String.valueOf(str.charAt(j)));
//                int ascii = (int) str.charAt(i) + jValue;
//                target = target + Character.toString(ascii);
//            }
//            j = j + 2;
//        }
//        return target;
//    }

}
