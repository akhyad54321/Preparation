package com.ganeshaa.TOPICS.Topic1.java8features.pc.practice;

import java.util.function.Function;
import java.util.function.Supplier;

//public class F1 implements Function<Integer, String> {
//
//    @Override
//    public String apply(Integer i){
//        String s1 = "hello".concat(String.valueOf(i));
//        return s1;
//    }
//
//    public static void main(String[] args) {
//        Function function = new F1();
//        System.out.println(function.apply(45));
//    }
//}

public class F1{
    public static void main(String[] args) {

       Function<String, Integer> function = (String s)->{
           return Integer.valueOf(s);
       };

        System.out.println(function.apply(String.valueOf(6)));

    }
}
