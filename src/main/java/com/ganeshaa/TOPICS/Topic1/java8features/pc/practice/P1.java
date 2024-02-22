package com.ganeshaa.TOPICS.Topic1.java8features.pc.practice;

import java.util.function.Predicate;

//public class P1 implements Predicate<Integer> {
//
//    @Override
//    public boolean test(Integer i){
//        return (i%2==0);
//    }
//
//    public static void main(String[] args) {
//        Predicate predicate = new P1();
//        System.out.println( predicate.test(9));
//    }
//}
public class P1{
    public static void main(String[] args) {

        Predicate<Integer> predicate = (i)->{
            return (i%2==0);
        };
        System.out.println(predicate.test(10));

    }
}
