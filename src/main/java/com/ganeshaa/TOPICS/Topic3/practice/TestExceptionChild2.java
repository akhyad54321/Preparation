package com.ganeshaa.TOPICS.Topic3.practice;

class Parent1{
    void msg()throws ArithmeticException {
        System.out.println("parent method");
    }
}

public class TestExceptionChild2 extends Parent1{
    @Override
    void msg()throws ClassCastException {
        System.out.println("child method");
    }

    public static void main(String args[]) {
        Parent1 p = new TestExceptionChild2();

        try {
            p.msg();
        }
        catch (Exception e){}

    }
}