package com.ganeshaa.TOPICS.Topic1.java8features.pc.practice;

import java.util.function.Supplier;

//public class S1 implements Supplier<String> {
//    @Override
//    public String get(){
//        return "Hello Ganeshaa";
//    }
//
//    public static void main(String[] args) {
//        Supplier supplier = new S1();
//
//        System.out.println( supplier.get());
//    }
//}

public class S1{
    public static void main(String[] args) {

        Supplier supplier = ()->{
            return "Hello";
        };

        System.out.println(supplier.get());
    }
}
