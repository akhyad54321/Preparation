package com.ganeshaa.practice.servosys;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class JavaEightCollection2 {
    public static void main(String[] args) {
//        1. Write a Java 8 program using a lambda expression to add two integers.
        BiFunction<Integer, Integer, Integer> add = (a,b)->{
          return a+b;
        };
        System.out.println(add.apply(3,5));
        System.out.println("---------------------------------------------------------");

//        2. Write a Java 8 program to filter and print even numbers from a list.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(num->num%2==0).collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("---------------------------------------------------------");

//        3. Write a Java 8 program to map integers to their squares and print results.
        List<Integer> number = Arrays.asList(1, 2, 3, 4);
        number.stream().map(i->i*i).collect(Collectors.toList()).forEach(i-> System.out.println(i));
        System.out.println("---------------------------------------------------------");

//        4. Write a Java 8 program to find and print the maximum value from a list.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        Integer integer = numbers1.stream().max((a, b) -> a > b ? 1 : -1).get();
        System.out.println(integer);
        System.out.println("---------------------------------------------------------");

//        5. Write a Java 8 program to count and print the number of elements in a list.
        List<String> words = Arrays.asList("apple", "banana", "pear");
        long count = words.stream().count();
        System.out.println(count);
        System.out.println("---------------------------------------------------------");

//        6. Write a Java 8 program to reduce a list of integers to their sum.
        List<Integer> number1 = Arrays.asList(1, 2, 3);
        Integer reduce = number1.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        System.out.println("---------------------------------------------------------");

//        7. Write a Java 8 program to print the lengths of strings in a list
        List<String> word = Arrays.asList("Java", "Python", "JavaScript");
        word.stream().map(i->i.length()).collect(Collectors.toList()).forEach(i-> System.out.println(i));
        System.out.println("---------------------------------------------------------");

//        8. Write a Java 8 program to print distinct elements from a list of integers.
        List<Integer> numbers2 = Arrays.asList(1, 2, 2, 3, 4, 4);
        numbers2.stream().distinct().collect(Collectors.toList()).forEach(i-> System.out.println(i));
        System.out.println("---------------------------------------------------------");

//        9. Write a Java 8 program to print names sorted in alphabetical order from a list.
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        names.stream().sorted().collect(Collectors.toList()).forEach(i-> System.out.println(i));
        System.out.println("---------------------------------------------------------");

//        13. Write a Java 8 program to limit and skip elements in a list, then print.
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        numbers4.stream().limit(3).skip(2).collect(Collectors.toList()).forEach(i-> System.out.println(i));
        System.out.println("---------------------------------------------------------");

//        14. Write a Java 8 program to find and print the first element in sorted order.
        List<Integer> numbers5 = Arrays.asList(5, 3, 1, 4, 2);
        Integer integer1 = numbers5.stream().sorted().findFirst().get();
        System.out.println(integer1);
        System.out.println("---------------------------------------------------------");

//        15. Write a Java 8 program to create a custom functional interface for addition.

        interface I1{
            int apply(int a, int b);
        }

        I1 added = (a,b)-> a+b;
        System.out.println(added.apply(3,4));
        System.out.println("---------------------------------------------------------");

//        19. Write a Java 8 program using reduce to calculate the product of a list.
        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4);
        Integer reduce1 = numbers6.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduce1);
        System.out.println("---------------------------------------------------------");

    }
}
