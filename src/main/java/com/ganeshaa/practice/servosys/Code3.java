package com.ganeshaa.practice.servosys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee{
   private int empId;
   private String empName;
   private int salary;
}

public class Code3 { //10th Highest Salary from 2 lakh data:
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "John", 5000));
        list.add(new Employee(2, "Alice", 12000));
        list.add(new Employee(3, "Bob", 7000));
        list.add(new Employee(4, "Daisy", 15000));
        list.add(new Employee(5, "Eva", 11000));
        list.add(new Employee(10, "John1", 50000));
        list.add(new Employee(20, "Alice1", 120000));
        list.add(new Employee(30, "Bob1", 70000));
        list.add(new Employee(40, "Daisy1", 150000));
        list.add(new Employee(50, "Eva1", 110000));
        list.add(new Employee(100, "John2", 5000000));
        list.add(new Employee(200, "Alice2", 12000000));
        list.add(new Employee(300, "Bob2", 70000000));
        list.add(new Employee(400, "Daisy2", 15000000));
        list.add(new Employee(500, "Eva2", 11000000));

        Employee employee = list.stream().sorted((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary())).skip(9).findFirst().get();
        System.out.println(employee);

        Optional<Employee> first = list.stream().sorted((e1, e2) -> Integer.compare(e1.getSalary(), e2.getSalary())).skip(9).findFirst();
        System.out.println(first.get());
    }
}
