package com.ganeshaa.TOPICS.Topic2.practice;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListPractice_05072026 {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add("alkhs");
        list.add("nsxknskxs");
        list.add(3);

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("-----------------");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
        System.out.println("-----------------");

        ListIterator prev = list.listIterator(list.size());
        while (prev.hasPrevious()){
            System.out.println(prev.previous());
        }
    }
}
