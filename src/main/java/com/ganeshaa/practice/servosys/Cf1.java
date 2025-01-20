package com.ganeshaa.practice.servosys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
import java.util.TreeMap;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Student implements Comparable<Student>{
    private int id;
    private String name;
    private String location;

    @Override
    public int compareTo(Student s1){
        return this.id - s1.id;
    }
//    @Override
//    public int compareTo(Student s1){
//        return this.name.compareTo(s1.name);
//    }
}
public class Cf1 {
    public static void main(String[] args) {
        Map<Student, Integer> map = new TreeMap<>();
        map.put(new Student(1,"Akhilesh", "Airoli"), 1);
        map.put(new Student(3, "Sanket", "Thane"), 2);
        map.put(new Student(2, "Sumit", "Panvel"), 3);
        map.put(new Student(5, "Yogesh", "Pune"), 4);
        map.put(new Student(4, "Ganeshaa", "Swarg"), 5);

        for (Map.Entry<Student, Integer> m :map.entrySet()){
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}
