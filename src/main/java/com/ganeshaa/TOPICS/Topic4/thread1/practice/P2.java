package com.ganeshaa.TOPICS.Topic4.thread1.practice;

class MyThread1 implements Runnable{

    @Override
    public void run(){
        for (int i=0; i<3; i++){
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
    public void run(int a){
        System.out.println("Hello a");
    }
}
public class P2 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Thread thread = new Thread(t1);
        thread.start();

//        t1.run();
    }
}
