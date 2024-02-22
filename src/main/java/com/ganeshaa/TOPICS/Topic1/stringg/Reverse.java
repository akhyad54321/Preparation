package com.ganeshaa.TOPICS.Topic1.stringg;

public class Reverse {
    public static void main(String[] args) {
        String name = "Akhilesh";
        String rev = "";
        for (int i=0; i<name.length(); i++){
            rev =  name.charAt(i)+ rev;
        }
        System.out.println(rev);
    }
}
