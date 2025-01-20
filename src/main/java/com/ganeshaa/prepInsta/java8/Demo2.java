package com.ganeshaa.prepInsta.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

//https://www.ccbp.in/blog/articles/java-8-coding-interview-questions-and-answers
public class Demo2 {
    public static void main(String[] args) {
//        1. Write a Java 8 program using a lambda expression to add two integers.
        BiFunction<Integer, Integer, Integer> add = (a,b)-> a+b;
        System.out.println(add.apply(3,4));
        System.out.println("--------------------------------------------");

//        2. Write a Java 8 program to filter and print even numbers from a list.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(num->num%2==0).collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("--------------------------------------------");

//        3. Write a Java 8 program to map integers to their squares and print results.
        List<Integer> number = Arrays.asList(1, 2, 3, 4);
        number.stream().map(num->num*num).collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("--------------------------------------------");

//        4. Write a Java 8 program to find and print the maximum value from a list.
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);
        Integer max = numbers1.stream().max((a, b) -> a > b ? 1 : -1).get();
        System.out.println("max = " + max);

        Integer min = numbers1.stream().min((a, b) -> a < b ? -1 : 1).get();
        System.out.println("min = " + min);
        System.out.println("--------------------------------------------");

//        5. Write a Java 8 program to count and print the number of elements in a list.
        List<String> words = Arrays.asList("apple", "banana", "pear");
        long count = words.stream().count();
        System.out.println(count);
        System.out.println("--------------------------------------------");

//        6. Write a Java 8 program to reduce a list of integers to their sum.
        List<Integer> numberr  = Arrays.asList(1, 2, 3, 4);
        Integer adda = numberr.stream().reduce(0, (a, b) -> a + b);
        System.out.println(adda);

        Integer mul = numberr.stream().reduce(1, (a, b) -> a * b);
        System.out.println("mul = " + mul);
        System.out.println("--------------------------------------------");

//        7. Write a Java 8 program to print the lengths of strings in a list.
        List<String> word = Arrays.asList("Java", "Python", "JavaScript");
        word.stream().map(w->w.length()).collect(Collectors.toList()).forEach(w-> System.out.println(w));
        System.out.println("--------------------------------------------");

//        8. Write a Java 8 program to print distinct elements from a list of integers.
        List<Integer> numberss = Arrays.asList(1, 2, 2, 3, 4, 4);
        numberss.stream().distinct().collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("--------------------------------------------");


//        9. Write a Java 8 program to print names sorted in alphabetical order from a list.
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        names.stream().sorted().collect(Collectors.toList()).forEach(wordd-> System.out.println(wordd));
        System.out.println("--------------------------------------------");

//        12. Write a Java 8 program to collect squares of numbers into a new list.
        List<Integer> number1 = Arrays.asList(1, 2, 3);
        number1.stream().map(i->i*i).collect(Collectors.toList()).forEach(i-> System.out.println(i));
        System.out.println("--------------------------------------------");

//        13. Write a Java 8 program to limit and skip elements in a list, then print.
        List<Integer> number2 = Arrays.asList(1, 2, 3, 4, 5);
        number2.stream().limit(4).skip(2).collect(Collectors.toList()).forEach(i-> System.out.println(i));
        System.out.println("--------------------------------------------");

//        14. Write a Java 8 program to find and print the first element in sorted order.
        List<Integer> number3 = Arrays.asList(5, 3, 1, 4, 2);
        Integer first = number3.stream().sorted().findFirst().get();
        System.out.println("first = " + first);
        System.out.println("--------------------------------------------");

//        15. Write a Java 8 program to create a custom functional interface for addition.

        BiFunction<Integer, Integer, Integer> sum = (a,b)->a+b;
        System.out.println(sum.apply(3,4));
        System.out.println("--------------------------------------------");

    }
}
