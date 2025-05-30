package com.ganeshaa.TOPICS.Topic4.practice;

class MyThreadd extends Thread{
    static Thread mainThread;

    public void run(){
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
public class P3 {
    public static void main(String[] args) throws InterruptedException {
        MyThreadd.mainThread =  Thread.currentThread();
        MyThreadd t1 = new MyThreadd();
        t1.start();

//        t1.join();
        for (int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
