package com.ganeshaa.TOPICS.Topic4.thread.practice;

class Childd extends Thread{

    @Override
    public void run(){
        for (int i = 0; i<5; i ++){
            System.out.println(Thread.currentThread().getName() +  " - " + i);
        }
    }

}
public class P6 {
    public static void main(String[] args) {
        Thread.currentThread().setName("MainThread");
        Childd c1 = new Childd();
        c1.setName("ChildThread");
        c1.start();

        for (int i = 0; i<5; i ++){
            System.out.println(Thread.currentThread().getName() +  " - " + i);
        }
    }
}
