package com.ganeshaa.practice.servosys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Student1 implements Comparable<Student1>{
    private int id;
    private String name;
    private String location;

    @Override
    public int compareTo(Student1 s1){
        return this.name.compareTo(s1.name);
    }

//    @Override
//    public int compareTo(Student1 s1){
//        return this.id-s1.id;
//    }
}
public class Cf3 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        Student1 s1 = new Student1(1, "Akhilesh", "Airoli");
        Student1 s2 = new Student1(3, "Sanket", "Thane");
        Student1 s3 = new Student1(2, "Sanket", "Panvel");
        Student1 s4 = new Student1(5, "Yogesh", "Pune");
        Student1 s5 = new Student1(4, "Ganeshaa", "Swarg");

        list.add(s1); list.add(s2); list.add(s3); list.add(s4); list.add(s5);
        Collections.sort(list);

        Iterator<Student1> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
