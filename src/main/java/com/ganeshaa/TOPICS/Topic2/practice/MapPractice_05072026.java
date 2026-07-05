package com.ganeshaa.TOPICS.Topic2.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Student {
    private int studentId;
    private String studentName;

    @Override
    public int hashCode(){
        return studentId;
    }

    @Override
    public boolean equals(Object obj){
        Student s1 = (Student) obj;
        return this.studentId == s1.studentId;
    }
}

public class MapPractice_05072026 {
    public static void main(String[] args) {
        LinkedHashMap<Student, Integer> map = new LinkedHashMap<>();

        Student s1 = new Student(1, "akhilesh");
        Student s2 = new Student(2, "yogesh");
        Student s3 = new Student(3, "nilesh");
        Student s4 = new Student(3, "sagar");
        Student s5 = new Student(4, "akhilesh");

        map.put(s1, 1);
        map.put(s2, 2);
        map.put(s3, 3);
        map.put(s4, 4);
        map.put(s5, 5);


        for (Map.Entry<Student, Integer> m : map.entrySet()){
            System.out.println(m.getKey() + " - " + m.getValue());
        }


    }
}
