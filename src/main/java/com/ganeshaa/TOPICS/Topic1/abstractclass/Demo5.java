package com.ganeshaa.TOPICS.Topic1.abstractclass;

abstract class Vehicle {
    String msg;

    Vehicle(String msg) {
        this.msg = msg;
    }

    void display() {
        System.out.println(msg);
    }
}

class Honda extends Vehicle {

    Honda(String msg) {
        super(msg);
    }

}

public class Demo5 {
    public static void main(String[] args) {
        Honda obj = new Honda("Hello");
        obj.display();
    }
}
