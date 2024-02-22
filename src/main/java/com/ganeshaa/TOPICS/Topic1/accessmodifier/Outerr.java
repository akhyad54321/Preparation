package com.ganeshaa.TOPICS.Topic1.accessmodifier;

public class Outerr {

    public class Inner {
        void show() {
            System.out.println("inner class show method");
        }
    }

    public static void main(String[] args) {
        Outerr outerr = new Outerr();
        Inner inner = outerr.new Inner();
        inner.show();
    }
}
