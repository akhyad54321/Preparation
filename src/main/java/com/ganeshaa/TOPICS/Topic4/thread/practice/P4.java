package com.ganeshaa.TOPICS.Topic4.thread.practice;
class Child extends Thread{
    static Thread main;
    public void run(){
        try {
            main.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=0; i<3; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }
    }
}
public class P4 {
    public static void main(String[] args) throws InterruptedException {

       Child.main =  Thread.currentThread();
        Child child = new Child();
        child.start();

//        child.join();
        for (int i=0; i<3; i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + "-" + i);
        }

    }
}
