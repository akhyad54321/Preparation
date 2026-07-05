package com.ganeshaa.TOPICS.Topic4.practice;

class Thread1 extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                Thread.sleep(2000);
                System.out.println("name: " + Thread.currentThread().getName());
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

public class P1_05072026 {
    public static void main(String[] args) throws InterruptedException {

        Thread1 t1 = new Thread1();
        t1.setName("Child-Thread");
        t1.start();

        t1.join();
        for (int i = 1; i <= 5; i++) {
            Thread.sleep(1000);
            System.out.println("name: " + Thread.currentThread().getName());
        }
    }
}
