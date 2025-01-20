package com.ganeshaa.practice.servosys;

import java.util.Comparator;

public class IdComparator implements Comparator<Student2> {

    @Override
    public int compare(Student2 s1, Student2 s2){
        return s1.getId() - s2.getId();
    }
}
