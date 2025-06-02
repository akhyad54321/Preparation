package com.ganeshaa.TOPICS.Topic4.practice;

class Akh extends Thread {

    public void run() {
        System.out.println("iiiii");
    }
    public void start(){
        System.out.println("Start");
    }
}
public class P2 {
    public static void main(String[] args) {
        Akh a2 = new Akh();
        a2.start();
    }
}
