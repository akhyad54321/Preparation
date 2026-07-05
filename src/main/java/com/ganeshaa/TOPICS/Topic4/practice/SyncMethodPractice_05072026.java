package com.ganeshaa.TOPICS.Topic4.practice;

class Student {
    public synchronized void print() throws InterruptedException{
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}

public class SyncMethodPractice_05072026 {
    public static void main(String[] args) {
        Student student = new Student();
        Thread t1 = new Thread(() -> {
            try {
                student.print();
            } catch (Exception e) {}
        }, "s1");

        Thread t2 = new Thread(() -> {
            try {
                student.print();
            } catch (Exception e) {}
        }, "s2");

        t1.start();
        t2.start();
    }
}

