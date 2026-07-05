package com.ganeshaa.TOPICS.Topic4.practice;

class Song extends Thread {
    public static synchronized void print() throws InterruptedException{
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
    }

    @Override
    public void run() {
        try{
            print();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

public class SyncClassPractice_05072026 {
    public static void main(String[] args) {
        Song s1 = new Song();
        s1.setName("s1");
        s1.start();

        Song s2 = new Song();
        s2.setName("s2");
        s2.start();
    }
}
