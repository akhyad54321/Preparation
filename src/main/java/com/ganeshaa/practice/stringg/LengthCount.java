package com.ganeshaa.practice.stringg;

public class LengthCount {
    public static void main(String[] args) {
        String str = "akhilesh";
        int len = 0;

        for (char ch : str.toCharArray()){
            len++;
        }
        System.out.println(len);
    }
}
