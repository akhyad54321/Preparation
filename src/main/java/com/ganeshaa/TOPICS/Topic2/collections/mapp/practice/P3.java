package com.ganeshaa.TOPICS.Topic2.collections.mapp.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Departmentt implements Comparable {
    private int id;
    private String name;
    private double salary;

    @Override
    public int compareTo(Object obj) {
        Departmentt dept = (Departmentt) obj;
        return this.id - dept.id;
    }
}

public class P3{
    static void main(String[] args) {
        List<Departmentt> map = new ArrayList<>();
        Departmentt d1 = new Departmentt(1, "it", 12545);
        Departmentt d2 = new Departmentt(2, "comps", 5896);
        Departmentt d3 = new Departmentt(2, "electrical", 745896);
        Departmentt d4 = new Departmentt(3, "mech", 41256);

        map.add(d1);
        map.add(d2);
        map.add(d3);
        map.add(d4);

        Double aDouble = map.stream().map(departmentt -> departmentt.getSalary()).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(aDouble);

//        SELECT e.SALARY from EMPLOYEE e order by salary desc limit 1 offset 9;
//        for (Map.Entry<Department, Integer> m : map.entrySet()){
//            System.out.println(m.getKey() + " - " + m.getValue());
//        }
    }
}
