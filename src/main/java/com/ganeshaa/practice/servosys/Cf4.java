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
class Student2 {
    private int id;
    private String name;
    private String location;

}
public class Cf4 {
    public static void main(String[] args) {

        List<Student2> list = new ArrayList<>();
        Student2 s1 = new Student2(1, "Akhilesh", "Airoli");
        Student2 s2 = new Student2(3, "Sanket", "Thane");
        Student2 s3 = new Student2(2, "Sanket", "Panvel");
        Student2 s4 = new Student2(5, "Yogesh", "Pune");
        Student2 s5 = new Student2(4, "Ganeshaa", "Swarg");

        list.add(s1); list.add(s2); list.add(s3); list.add(s4); list.add(s5);
//        Collections.sort(list, new IdComparator());
        Collections.sort(list, new NameComparator());
        Iterator<Student2> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
