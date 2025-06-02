package com.ganeshaa.TOPICS.Topic4.mutualexclusive3.practice;

class Parent {
    public synchronized void sum() throws InterruptedException {
        for (int i=1;i<=5; i++){
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
class MyThreadd extends Thread{
    private Parent p1;
    public MyThreadd(Parent p1) {
        this.p1 = p1;
    }
    public void run() {
        try {
            p1.sum();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
public class SynchronizedMethodP1 {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        MyThreadd t1 = new MyThreadd(p1);
        t1.start();
        MyThreadd t2 = new MyThreadd(p1);
        t2.start();
        MyThreadd t3 = new MyThreadd(p1);
        t3.start();
    }
}
