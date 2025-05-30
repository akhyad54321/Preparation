package com.ganeshaa.TOPICS.Topic1.java8features.streamapi.practice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class P1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(12, 23, 67, 89,45, 65, 56, 2,8,10);
        list.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(i-> System.out.println(i));
        System.out.println("-----------------------");
        List<Integer> collect = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(collect);
        System.out.println("-------------------");
        List<Integer> collect1 = list.stream().map(i -> i * i).limit(3).collect(Collectors.toList());
        System.out.println(collect1);
        List<Integer> collect2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect2);
        System.out.println("--------------------------");
        Integer integer = list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(integer);

        List<String> stringList = List.of("Akhilesh", "Akash", "Sameer", "Dilip", "Kunal");
        List<String> collect3 = stringList.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(collect3);

        List<Boolean> collected = stringList.stream().map(name -> name.startsWith("A")).collect(Collectors.toList());
        System.out.println(collected);
    }
}
