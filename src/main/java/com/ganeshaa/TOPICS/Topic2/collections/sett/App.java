package com.ganeshaa.TOPICS.Topic2.collections.sett;

import java.util.LinkedHashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        LinkedHashMap<Employee, Integer> map = new LinkedHashMap<>();
        Employee e1 = new Employee(10, "Akhilesh");
        Employee e2 = new Employee(20, "Akhilesh");
        Employee e3 = new Employee(30, "Sameer");
        Employee e4 = new Employee(30, "Siddhesh");
        Employee e5 = new Employee(50, "Yusuf");

        map.put(e1, 1);
        map.put(e2, 2);
        map.put(e3, 3);
        map.put(e4, 4);
        map.put(e5, 5);

        for (Map.Entry<Employee, Integer> m : map.entrySet()){
            Employee emp = m.getKey();

            System.out.println(emp.id + " - " + emp.name);

        }
    }
}
