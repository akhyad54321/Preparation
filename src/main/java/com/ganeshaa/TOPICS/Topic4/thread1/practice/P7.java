package com.ganeshaa.TOPICS.Topic4.thread1.practice;

class Hello implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<5; i ++){
            System.out.println(Thread.currentThread().getName() +  " - " + i);
        }
    }
}
public class P7 {
    public static void main(String[] args) {
        Hello h1 = new Hello();
        Thread t1 =new Thread(h1);
        t1.start();

        for (int i = 0; i<5; i ++){
            System.out.println(Thread.currentThread().getName() +  " - " + i);
        }
    }
}
