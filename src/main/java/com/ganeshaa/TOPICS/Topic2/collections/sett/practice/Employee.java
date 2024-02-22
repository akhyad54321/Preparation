package com.ganeshaa.TOPICS.Topic2.collections.sett.practice;

public class Employee {
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
    public int hashCode() {
        return id;
    }
    @Override
    public boolean equals(Object obj) {
        Employee e1 = (Employee)obj;
        return this.id == e1.id;
    }
}
