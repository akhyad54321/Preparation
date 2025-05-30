package com.ganeshaa.TOPICS.Topic4.thread1.practice;

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
public class P1 {
    public static void main(String[] args) {
        Thread.currentThread().setName("MAIN THREAD");

        MyThread t1 = new MyThread();
        t1.setName("CHILD THREAD");
        t1.start();

        for (int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }

    }
}
