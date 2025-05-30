package com.ganeshaa.TOPICS.Topic1.java8features.pc.practice;

import java.util.function.Consumer;

//public class C1 implements Consumer<Integer> {
//    @Override
//    public void accept(Integer i){
//        System.out.println("Integer Value = " + i);
//    }
//
//    public static void main(String[] args) {
//        Consumer consumer = new C1();
//        consumer.accept(3);
//    }
//}

public class C1{
    public static void main(String[] args) {
       Consumer c = (i)->{
           System.out.println(i);
       };
       c.accept(5);
    }
}
