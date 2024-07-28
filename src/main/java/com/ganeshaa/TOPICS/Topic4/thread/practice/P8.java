package com.ganeshaa.TOPICS.Topic4.thread.practice;

class Hey extends Thread{
    static Thread main;
    @Override
    public void run(){
        try {
            main.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() +  " - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class P8 {
    public static void main(String[] args) throws InterruptedException {
        Hey.main = Thread.currentThread();

        Thread.currentThread().setName("MainThread");
        Hey h1 = new Hey();
        h1.setName("ChildThread");
        h1.start();


//        h1.join();
        for (int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() +  " - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
