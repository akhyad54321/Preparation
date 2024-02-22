package com.ganeshaa.TOPICS.Topic1.java8features.streamapi.practice;

import java.util.List;
import java.util.stream.Collectors;

public class P1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 23, 67, 89,45, 65, 56);
//
//        System.out.println("even no");
//        List<Integer> collect1 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect1);
//
//        System.out.println("cube of no");
//        List<Integer> collect2 = list.stream().map(i -> i * i).collect(Collectors.toList());
//        System.out.println(collect2);

        List<Integer> collect = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("====================================================================================");

//        List<String> stringList = List.of("Akhilesh", "Akash", "Sameer", "Dilip", "Kunal");
//        List<String> collect3 = stringList.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
//        System.out.println(collect3);
//
//        System.out.println("==============map========");
//
//        List<Boolean> collected = stringList.stream().map(name -> name.startsWith("A")).collect(Collectors.toList());
//        System.out.println(collected);
    }
}
