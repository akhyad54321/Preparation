package com.ganeshaa.practice.servosys;

import java.lang.reflect.Constructor;

public class Ganeshaa {
    public static void main(String[] args) {
        System.out.println("Ganeshaa");

//        Samosa s1 = new Samosa();
//        System.out.println(s1.hashCode());
//
//        Samosa s2 = new Samosa();
//        System.out.println(s2.hashCode());

//        Samosa s1 = Samosa.getSamosa();
//        Samosa s2 = Samosa.getSamosa();
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());

        User u1 = User.getUser();
        User u2 = User.getUser();

        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());

    }
}
