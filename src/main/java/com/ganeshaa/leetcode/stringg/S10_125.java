package com.ganeshaa.leetcode.stringg;

public class S10_125 {
    public static void main(String[] args) {
        S10_125 app = new S10_125();
        boolean palindrome = app.isPalindrome("A man, a plan, a canal: Panama");
        System.out.println("palindrome = " + palindrome);
    }
    public boolean isPalindrome(String s) {
        String str = "";
        String rev = "";
        for (int i=0; i<s.length(); i++){
            if (Character.isDigit(s.charAt(i)) || Character.isAlphabetic(s.charAt(i))){
                str = str + Character.toLowerCase(s.charAt(i));
                rev = Character.toLowerCase(s.charAt(i)) + rev;
            }
        }
        return str.equals(rev);
    }
}
