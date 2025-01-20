package com.ganeshaa.prepInsta.java8;

import javax.xml.stream.events.Characters;
import java.util.*;
import java.util.stream.Collectors;

//https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062
public class Demo1 {
    public static void main(String[] args) {

//      1)  Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream().filter(num->num%2==0).collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("----------------------------------------------------------------------------------------");

//        2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream().map(num->num+"").filter(num->num.startsWith("1")).collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("----------------------------------------------------------------------------------------");

//        3. How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> set = new HashSet<>();

        myList1.stream().filter(num->!set.add(num)).collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("----------------------------------------------------------------------------------------");

//        4. Given the list of integers, find the first element of the list using Stream functions?
        List<Integer> myList2 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer integer = myList2.stream().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println("integer = " + integer);
        System.out.println("----------------------------------------------------------------------------------------");

//        5. Given a list of integers, find the total number of elements present in the list using Stream functions?
        List<Integer> myList3 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count = myList3.stream().count();
        System.out.println(count);
        System.out.println("----------------------------------------------------------------------------------------");

//        6. Given a list of integers, find the maximum value element present in it using Stream functions?
        List<Integer> myList4 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Integer intt = myList4.stream().sorted(Collections.reverseOrder()).findFirst().get();
        System.out.println(intt);
        System.out.println("----------------------------------------------------------------------------------------");

//        9. Given a list of integers, sort all the values present in it using Stream functions?
        List<Integer> myList5 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList5.stream().sorted().collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("----------------------------------------------------------------------------------------");

//        10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
        List<Integer> myList6 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList6.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("----------------------------------------------------------------------------------------");

//        11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        List<Integer> myList7 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        HashSet<Integer> sett = new HashSet<>();
        List<Integer> collect = myList7.stream().filter(num -> !sett.add(num)).collect(Collectors.toList());
        if (collect.isEmpty()){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
        System.out.println("----------------------------------------------------------------------------------------");

//        14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().map(num->num*num*num).filter(num->num > 50).collect(Collectors.toList()).forEach(num-> System.out.println(num));
        System.out.println("----------------------------------------------------------------------------------------");

//        16. How to use map to convert object into Uppercase in Java 8?
        List<String> nameLst = new ArrayList<>();
        nameLst.add("Akhilesh"); nameLst.add("Yadav");
        List<String> collect1 = nameLst.stream().map(word -> word.toUpperCase()).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println("----------------------------------------------------------------------------------------");

//        17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
        List<Notes> noteList = new ArrayList<>();
        noteList.add(new Notes(1, "note1", 11));
        noteList.add(new Notes(2, "note2", 22));
        noteList.add(new Notes(3, "note3", 33));
        noteList.add(new Notes(4, "note4", 44));
        noteList.add(new Notes(5, "note5", 55));
        noteList.add(new Notes(6, "note4", 66));

        Integer fifth = noteList.stream().map(salary -> salary.getSalary()).sorted().skip(4).findFirst().get();
        System.out.println("fifth = " + fifth);

        noteList.stream().map(id->id.getId()).filter(id->id>3).collect(Collectors.toList()).forEach(id-> System.out.println(id));
        System.out.println("===========");
        noteList.stream().map(salary->salary.getSalary()).sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(salary-> System.out.println(salary));
        System.out.println("----------------------------------------------------------------------------------------");

//        19. How to find only duplicate elements with its count from the String ArrayList in Java8?
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");
        HashSet<String> seet = new HashSet<>();
        names.stream().filter(word->!seet.add(word)).collect(Collectors.toList()).forEach(word-> System.out.println(word));
        System.out.println("----------------------------------------------------------------------------------------");

//        21. Write a Program to find the Maximum element in an array?
        List<Integer> listt = Arrays.asList(4,5,6,7,1,2,3);
        Integer max = listt.stream().max((a, b) -> a > b ? 1 : -1).get();
        System.out.println("max = " + max);
        Integer min = listt.stream().min((a, b) -> a < b ? -1 : 1).get();
        System.out.println("min = " + min);

    }
}
