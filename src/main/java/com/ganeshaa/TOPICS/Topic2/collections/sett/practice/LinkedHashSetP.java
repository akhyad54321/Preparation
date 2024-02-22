package com.ganeshaa.TOPICS.Topic2.collections.sett.practice;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetP {
    public static void main(String[] args) {

        LinkedHashSet<Employee> set = new LinkedHashSet<>();
        Employee e1 = new Employee(1, "Akhilesh");
        Employee e2 = new Employee(2, "Akhilesh");
        Employee e3 = new Employee(3, "Sameer");
        Employee e4 = new Employee(3, "Siddhesh");
        Employee e5 = new Employee(5, "Yusuf");

        set.add(e1); set.add(e2); set.add(e3); set.add(e4); set.add(e5);

        Iterator<Employee> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
