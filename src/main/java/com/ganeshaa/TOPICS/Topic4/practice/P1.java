package com.ganeshaa.TOPICS.Topic4.practice;

class Akhilesh extends Thread{
    public void run(){
        for (int i=0; i<5;i++){
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class P1 {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().setName("maint");
        Akhilesh a1 = new Akhilesh();
        a1.setName("child");
        a1.start();

        a1.join();
        for (int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
