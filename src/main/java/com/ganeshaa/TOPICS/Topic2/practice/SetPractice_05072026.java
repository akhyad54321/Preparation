package com.ganeshaa.TOPICS.Topic2.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Iterator;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Department {
    private int deptId;
    private String deptName;

    @Override
    public int hashCode() {
        return deptId;
    }

    @Override
    public boolean equals(Object obj) {
        Department d1 = (Department) obj;
        return this.deptId == d1.deptId;
    }
}

public class SetPractice_05072026 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        Department d1 = new Department(1, "it");
        Department d2 = new Department(2, "comps");
        Department d3 = new Department(3, "mech");
        Department d4 = new Department(3, "elec");
        Department d5 = new Department(4, "it");

        set.add(d1);
        set.add(d2);
        set.add(d3);
        set.add(d4);
        set.add(d5);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
