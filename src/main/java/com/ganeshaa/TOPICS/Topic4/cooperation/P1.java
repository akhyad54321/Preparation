package com.ganeshaa.TOPICS.Topic4.cooperation;

class MyThread extends Thread{
    int total = 0;
    public void run(){
        synchronized (this){
            for (int i=1;i<=5; i++){
                total = total+i;
            }
            this.notify();
        }
    }
}
public class P1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();
        synchronized (t1){
            t1.wait();
            System.out.println(t1.total);
        }
    }
}
