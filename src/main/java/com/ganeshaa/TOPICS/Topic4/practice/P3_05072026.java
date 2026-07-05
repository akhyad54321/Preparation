package com.ganeshaa.TOPICS.Topic4.practice;

class Thread3 extends Thread {
    static Thread mainThread;
    @Override
    public void run() {
        try {
            mainThread.join();
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(2000);
                System.out.println("name: " + Thread.currentThread().getName());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class P3_05072026 {
    public static void main(String[] args) throws InterruptedException{
        Thread3.mainThread = Thread.currentThread();

        Thread3 t3 = new Thread3();
        t3.setName("Child Thread");
        t3.start();

        t3.join();
        for (int i = 1; i <= 5; i++) {
            Thread.sleep(1000);
            System.out.println("name: " + Thread.currentThread().getName());
        }
    }
}
