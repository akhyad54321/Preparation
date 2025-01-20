package com.ganeshaa.practice.servosys;

import java.util.*;
import java.util.stream.Collectors;

public class JavaEightCollection {
    public static  void main(String[] args) {
//        Given a list of integers, find out all the even numbers that exist in the list using Stream functions?/
        List<Integer> list = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList()).forEach(num -> System.out.println(num));

        System.out.println("--------------------------------------------------------------------------");
//        2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        myList.stream().map(i -> i + "").filter(num -> num.startsWith("1")).collect(Collectors.toList()).forEach(i -> System.out.println(i));
        System.out.println("--------------------------------------------------------------------------");

//        3. How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> myList1 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
//        myList1.stream().distinct().collect(Collectors.toList()).forEach(i-> System.out.println(i));
        Set<Integer> set = new HashSet<>();
        myList1.stream().filter(i -> !set.add(i)).collect(Collectors.toList()).forEach(i -> System.out.println(i));
        System.out.println("--------------------------------------------------------------------------");

//        4. Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> myList2 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Integer integer = myList2.stream().findFirst().get();
        System.out.println(integer);
        Integer integer1 = myList2.stream().sorted().skip(5).findFirst().get();
        System.out.println(integer1);
        System.out.println("--------------------------------------------------------------------------");

//        5. Given a list of integers, find the total number of elements present in the list using Stream functions?
        List<Integer> myList3 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        long count = myList3.stream().count();
        System.out.println(count);
        System.out.println("--------------------------------------------------------------------------");


//        6. Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> myList4 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Integer i1 = myList4.stream().max((a, b) -> a > b ? 1 : -1).get();
        System.out.println("max = " + i1);
        Integer i2 = myList4.stream().min((a, b) -> a < b ? -1 : 1).get();
        System.out.println("min = " + i2);
        System.out.println("--------------------------------------------------------------------------");

//        10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
        List<Integer> myList5 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        myList5.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(num -> System.out.println(num));
        System.out.println("--------------------------------------------------------------------------");


//        11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        List<Integer> myList6 = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> sett = new HashSet<>();
        List<Integer> collect = myList6.stream().filter(num -> !set.add(num)).collect(Collectors.toList());
        if (collect.size() > 0) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println("--------------------------------------------------------------------------");


//        14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().map(num->num*num*num).filter(num->num>50).collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("--------------------------------------------------------------------------");

//        16. How to use map to convert object into Uppercase in Java 8?
        List<String> list1 = Arrays.asList("AKH", "YAD", "SON");
        list1.stream().map(word->word.toUpperCase()).collect(Collectors.toList()).forEach(word-> System.out.println(word));

    }
}
