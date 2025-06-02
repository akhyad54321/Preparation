package com.ganeshaa.TOPICS.Topic4.mutualexclusive3;

class T1 extends Thread{
    public  void sum(){
        synchronized (T1.class){
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
public class Self1Success {
    public static void main(String[] args) {
        T1 t1 = new T1();
        t1.start();

        T1 t2 = new T1();
        t2.start();
    }
}
