package com.ganeshaa.practice.onelasttime;

public class S1 {
    public static void main(String[] args) {
        String name = "akhilesh";
        String str = name.toLowerCase();
        String c = "";
        String v = "";
        for (int i=0; i<str.length(); i++){
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' ||ch=='u'){
                c = c + ch;
            }else{
                v = v + ch;
            }
        }
        System.out.println(c);
        System.out.println(v);
    }
}
