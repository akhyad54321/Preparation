package com.ganeshaa.practice.ganeshaa;

public class C1 {
    public static void main(String[] args) {
        String name = "Akhilesh Yadav";
        String lowerCase = name.toLowerCase();

        String v = "";
        String c = "";

        for (int i=0; i<lowerCase.length(); i++){
            char ch = lowerCase.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                v = v + ch;
            }else{
                c = c+ ch;
            }
        }

        System.out.println("vowel = " + v);
        System.out.println("consonent = " + c);
    }
}
