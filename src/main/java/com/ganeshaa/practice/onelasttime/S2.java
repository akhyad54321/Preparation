package com.ganeshaa.practice.onelasttime;

public class S2 {
    public static void main(String[] args) {
        String str = "akhilshy012@#$%^&";
        String alp = "";

        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (ch >=97 && ch <=122){
                alp = alp + ch;
            }
        }
        System.out.println(alp);
//        for (int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            if (Character.isAlphabetic(ch)){
//                alp = alp + ch;
//            }
//        }
//        System.out.println(alp);
    }
}
