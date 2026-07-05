package com.ganeshaa.TOPICS.Topic4.practice;

class Thread2 implements Runnable {
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
public class P2_05072026 {
    public static void main(String[] args) throws InterruptedException{
        Thread2 t2 = new Thread2();
        Thread thread = new Thread(t2);
        thread.start();

        for (int i = 1; i <= 5; i++) {
            Thread.sleep(1000);
            System.out.println("name: " + Thread.currentThread().getName());
        }
    }
}
