package com.ganeshaa.TOPICS.Topic1.java8features.Optionall;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String[] str = new String[5];

        str[0] = "zero";
        str[1] = "one";
        str[2] = "two";
        str[3] = "tHREE";
        str[4] = "four";
//        String fifth = str[3].toLowerCase();
//        System.out.print(fifth);

        Optional<String> optionalString = Optional.ofNullable(str[3]);
        if (optionalString.isPresent()){
            System.out.println(str[3].toLowerCase());
        }else {
            System.out.println("Empty value hai");
        }
    }
}