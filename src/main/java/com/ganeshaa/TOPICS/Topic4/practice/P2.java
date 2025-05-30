package com.ganeshaa.TOPICS.Topic4.practice;

class Akh implements Runnable{

    @Override
    public void run() {
        System.out.println("iiiii");
    }
}
public class P2 {
    public static void main(String[] args) {
        Akh a2 = new Akh();
        Thread t1 = new Thread(a2);
        t1.start();
    }
}
