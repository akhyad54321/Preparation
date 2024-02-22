package com.ganeshaa.leetcode.stringg;

public class S1_2108 {
    public static void main(String[] args) {
        S1_2108 app1 = new S1_2108();
        String s = app1.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"});
        System.out.println("s = "+ s);
    }

    public String firstPalindrome(String[] words) {
        String ans = "";
        for (String str : words){
            StringBuilder rev = new StringBuilder(str);
            String reverse = String.valueOf(rev.reverse());
            if (str.equals(reverse)){
                ans=str;
                break;
            }
        }
        return ans;
    }
//    public String firstPalindrome(String[] words) {
//        String ans = "";
//        for (int i=0; i<words.length; i++){
//            String str = words[i];
//            String rev = "";
//            for (int j=0; j<str.length(); j++){
//                rev = str.charAt(j) + rev;
//            }
//            if (str.equals(rev)){
//                ans = str;
//                break;
//            }
//        }
//        return ans;
//    }
}
