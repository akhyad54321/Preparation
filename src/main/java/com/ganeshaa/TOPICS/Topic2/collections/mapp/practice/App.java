package com.ganeshaa.TOPICS.Topic2.collections.mapp.practice;

import java.util.LinkedHashMap;
import java.util.Map;

class Employee{
    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode(){
        return id;
    }
    @Override
    public boolean equals(Object object){
        Employee employee = (Employee) object;
        return this.id == employee.id;
    }

}
public class App {
    public static void main(String[] args) {
        LinkedHashMap<Employee, Integer> empMap = new LinkedHashMap<>();
        Employee e1 = new Employee(1, "Akhilesh");
        Employee e2 = new Employee(2, "Sameer");
        Employee e3 = new Employee(3, "Akash");
        Employee e4 = new Employee(3, "Siddhesh");
        Employee e5 = new Employee(5, "Kunal");

        empMap.put(e1, 1);
        empMap.put(e2, 2);
        empMap.put(e3, 3);
        empMap.put(e4, 4);
        empMap.put(e5, 5);

        for (Map.Entry<Employee, Integer> m: empMap.entrySet()){
            Employee employee = m.getKey();
            System.out.println(employee);
        }

    }
}
