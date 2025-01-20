package com.ganeshaa.practice.servosys;

import java.util.HashMap;
import java.util.Map;

public class Code1 { //1Hasmape to iterate and print key values

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Akhilesh");
        map.put(2, "sanket");
        map.put(3, "sumit");


//        System.out.println(map);

//        for(Map.Entry<Integer, String> m : map.entrySet()){
//            System.out.println(m.getKey() + " - " + m.getValue());
//        }

        map.forEach((key, value)-> System.out.println("key = " + key + "  value = " + value));
    }
}
