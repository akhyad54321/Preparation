package com.ganeshaa.TOPICS.Topic2.collections.sett.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Department{
    private int id;
    private String name;

    @Override
    public int hashCode(){
        return id;
    }

    @Override
    public boolean equals(Object obj){
        Department department = (Department) obj;
        return this.id == department.id;
    }
}
public class P1 {
    public static void main(String[] args) {
        LinkedHashSet<Department> set = new LinkedHashSet<>();
        Department d1 = new Department(1, "It");
        Department d2 = new Department(2, "Comps");
        Department d3 = new Department(2, "Electrical");

        set.add(d1); set.add(d2); set.add(d3);

        for (Department dep : set){
            System.out.println("id = " + dep.getId() + " - " + " name = " + dep.getName());
        }
    }
}
