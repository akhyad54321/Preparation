package com.ganeshaa.TOPICS.Topic4.mutualexclusive3;

class Practice extends Thread {

    static synchronized void show() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + " = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public void run() {
        show();
    }
}

public class Self {
    public static void main(String[] args) {

        Practice p = new Practice();
        p.start();

        Practice p1 = new Practice();
        p1.start();
    }
}
