package com.ganeshaa.practice.stringg;

import java.util.Scanner;

class Main {

    public static String PalindromicSubstring(String str) {
        int low ;
        int high ;
        int pal_len = 1;
        int pal_start = 0;

        for(int i = 0 ; i < str.length() ; i++){
            //even
            low = i;
            high = i + 1;

            while(low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)){

                if(high - low + 1 > pal_len){
                    pal_start = low;
                    pal_len = high - low + 1;
                }

                low--;
                high++;
            }

            //odd
            low = i;
            high = i;

            while(low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)){

                if(high - low + 1 > pal_len){
                    pal_start = low;
                    pal_len = high - low + 1;
                }
                low--;
                high++;
            }
        }

        return str.substring(pal_start, pal_start + pal_len);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = s.nextLine();
        String palindromicSubstring = PalindromicSubstring(str);
        System.out.println("palindromicSubstring =" + palindromicSubstring);
    }

}
