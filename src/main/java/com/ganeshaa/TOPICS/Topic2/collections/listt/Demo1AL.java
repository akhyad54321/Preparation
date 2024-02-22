package com.ganeshaa.TOPICS.Topic2.collections.listt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterators.AbstractDoubleSpliterator;

public class Demo1AL {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");
        list.add("Papaya");
        list.add("Gulab");
        list.add("Kela");
        System.out.println(list);
//        Collections.sort(list);
//        System.out.println(list);
        System.out.println("--------------Iterator-----------------");

        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("=============");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }

//		  ListIterator<Integer> itr = list.listIterator(list.size());
//		  while(itr.hasPrevious()) {
//			  System.out.println(itr.previous());
//		  }


    }
}
