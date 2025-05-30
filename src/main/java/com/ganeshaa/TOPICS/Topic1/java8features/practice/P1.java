package com.ganeshaa.TOPICS.Topic1.java8features.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P1 {
    public static void main(String[] args) {
//        1. Write a Java 8 program using a lambda expression to add two integers.
        BiFunction<Integer, Integer, Integer> sum = (a,b)->a+b;
        System.out.println(sum.apply(2,3));

//        2. Write a Java 8 program to filter and print even numbers from a list.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> collect = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);

//        3. Write a Java 8 program to map integers to their squares and print results.
        List<Integer> number = Arrays.asList(1, 2, 3, 4);
        List<Integer> collect1 = number.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(collect1);

//        4. Write a Java 8 program to find and print the maximum value from a list.
        List<Integer> number1 = Arrays.asList(1, 2, 3, 4, 5);
        Integer max = number1.stream().max((a, b) -> a > b ? 1 : -1).get();
        System.out.println("max = " + max);
        Integer min = number1.stream().min((a, b) -> a < b ? -1 : 1).get();
        System.out.println("min = " + min);

//        6. Write a Java 8 program to reduce a list of integers to their sum.
        List<Integer> number3 = Arrays.asList(1, 2, 3, 4);
        Integer reduce = number3.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        Integer reduce1 = number3.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce1);

//        8. Write a Java 8 program to print distinct elements from a list of integers.
        List<Integer> number4 = Arrays.asList(1, 2, 2, 3, 4, 4);
        List<Integer> collect2 = number4.stream().distinct().collect(Collectors.toList());
        System.out.println(collect2);

//        14. Write a Java 8 program to find and print the second element in sorted order.
        List<Integer> number5 = Arrays.asList(5, 3, 1, 4, 2);
        Integer integer = number5.stream().sorted().skip(1).findFirst().get();
        System.out.println(integer);


    }
}
