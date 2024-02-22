package com.ganeshaa.TOPICS.Topic1.java8features.streamapi.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppEmp {
    public static void main(String[] args) {

        List<Employee> list =new ArrayList<>();
        list.add(new Employee(1, "Akhilesh", "Airoli"));
        list.add(new Employee(2, "Akash", "Panvel"));
        list.add(new Employee(3, "Sameer", "Pune"));
        list.add(new Employee(4, "Kunal", "Rabale"));
        list.add(new Employee(5, "Dilip", "Mumbai"));

        System.out.println(list);

        Map<Integer, String> map1 = list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        for (Map.Entry<Integer, String> m: map1.entrySet()){
            System.out.println(m.getKey() + "-" + m.getValue());
        }

        System.out.println("----------without using method reference--------");

        Map<Integer, String> collect = list.stream().collect(Collectors.toMap(employee -> employee.getId(), employee -> employee.getLocation()));
        for (Map.Entry<Integer, String> m : collect.entrySet()){
            System.out.println(m.getKey() + " - " + m.getValue());
        }


//        List<String> collect = map1.entrySet().stream().map(i -> i.getValue()).collect(Collectors.toList());
//        System.out.println(collect);

    }
}
