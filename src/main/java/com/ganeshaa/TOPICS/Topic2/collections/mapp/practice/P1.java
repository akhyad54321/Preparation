package com.ganeshaa.TOPICS.Topic2.collections.mapp.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.TreeMap;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Department implements Comparable{
    private int id;
    private String name;

    @Override
    public int compareTo(Object obj) {
        Department dept = (Department) obj;
        return this.id-dept.id;
    }
}

public class P1 {
    public static void main(String[] args) {
        TreeMap<Department, Integer> map = new TreeMap<>();
        Department d1 = new Department(1, "it");
        Department d2 = new Department(2, "comps");
        Department d3 = new Department(2, "electrical");
        Department d4 = new Department(3, "mech");

        map.put(d1,1);
        map.put(d2,2);
        map.put(d3,3);
        map.put(d4,4);

        for (Map.Entry<Department, Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}
