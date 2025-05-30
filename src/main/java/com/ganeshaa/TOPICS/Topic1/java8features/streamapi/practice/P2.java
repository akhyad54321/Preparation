package com.ganeshaa.TOPICS.Topic1.java8features.streamapi.practice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {
    private int id;
    private String name;
    private String location;
}

public class P2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(1, "e1", "airoli");
        Employee e2 = new Employee(2, "e2", "rabale");
        Employee e3 = new Employee(3, "e3", "ghansoli");
        Employee e4 = new Employee(4, "e4", "mahape");
        Employee e5 = new Employee(5, "e5", "kurla");

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        Map<Integer, String> collect = list.stream().collect(Collectors.toMap(i -> i.getId(), i -> i.getLocation()));
        System.out.println(collect);

        Map<Integer, String> map1 = list.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
        for (Map.Entry<Integer, String> m : map1.entrySet()) {
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }

}
