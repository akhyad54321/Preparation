package com.ganeshaa.TOPICS.Topic4.mutualexclusive3.practice;

class Bike{
    public static synchronized void sum() throws InterruptedException {
        for (int i=1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +  " - " + i);
        }
    }
}

class Mythread10 extends Thread{
    private Bike bike;
    public Mythread10(Bike bike){
        this.bike = bike;
    }
    public void run(){
        try {
            bike.sum();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class SynchronizedClassP1 {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike();
        Mythread10 t1 = new Mythread10(b1);
        t1.start();
        Mythread10 t2 = new Mythread10(b1);
        t2.start();
        Mythread10 t3 = new Mythread10(b1);
        t3.start();

        Mythread10 t4 = new Mythread10(b2);
        t4.start();
        Mythread10 t5 = new Mythread10(b2);
        t5.start();
        Mythread10 t6 = new Mythread10(b2);
        t6.start();

    }
}
