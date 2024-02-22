package com.ganeshaa.TOPICS.Topic1.overriding;

class Parent {
    int id = 10;

    void show() {
        System.out.println("show");
    }

    void print() {
        System.out.println("print");
    }

    static void music() {
        System.out.println("MUSIC");
    }

    final void call() {
        System.out.println("call");
    }

    private void mobile() {
        System.out.println("he");
    }
}

public class Demo1 extends Parent {
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        System.out.println(demo1.id);
        demo1.show();
        demo1.print();
        demo1.music();
        demo1.call();
//		demo1.mobile();
    }
}
