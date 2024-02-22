package com.ganeshaa.TOPICS.Topic3.practice;

import java.io.IOException;

class Parent{
    void msg() throws IOException{
        System.out.println("parent method");
    }
}

class TestExceptionChild1 extends Parent{
    void msg()throws IOException {
        System.out.println("child method");
    }

    public static void main(String args[]) throws IOException {
        Parent p = new Parent();
        p.msg();
    }
}
