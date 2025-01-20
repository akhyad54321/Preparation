package com.ganeshaa.practice.servosys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Studentt {
    private int id;
    private String name;
    private String location;

//    @Override
//    public boolean equals(Object ob){
//        Studentt s1 = (Studentt)ob;
//        return this.id == s1.id;
//    }

    @Override
    public boolean equals(Object ob){
        Studentt s1 = (Studentt)ob;
        return this.name.equals(s1.name);
    }

    @Override
    public int hashCode(){
        return id;
    }
}
public class Cf2 {
    public static void main(String[] args) {
        Map<Studentt, Integer> map = new HashMap<>();
        map.put(new Studentt(1,"Akhilesh", "Airoli"), 1);
        map.put(new Studentt(3, "Sanket", "Thane"), 2);
        map.put(new Studentt(3, "Sanket", "Panvel"), 3);
        map.put(new Studentt(5, "Yogesh", "Pune"), 4);
        map.put(new Studentt(4, "Ganeshaa", "Swarg"), 5);

        for (Map.Entry<Studentt, Integer> m :map.entrySet()){
            System.out.println(m.getKey() + " - " + m.getValue());
        }
    }
}
