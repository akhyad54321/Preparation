package com.ganeshaa.TOPICS.Topic4.mutualexclusive3;

class T10 extends Thread{
    static final Object lock = new Object();
    public void sum(){
        synchronized (lock){
            for (int i=1; i<=5; i++){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName() + " = " + i);
            }
        }
    }

    public void run(){
        sum();
    }
}
public class Self1Success2 {
    public static void main(String[] args) {
        T10 t1 = new T10();
        t1.start();

        T10 t2 = new T10();
        t2.start();
    }
}
