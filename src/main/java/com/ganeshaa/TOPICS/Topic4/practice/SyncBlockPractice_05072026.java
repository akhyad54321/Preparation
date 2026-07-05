package com.ganeshaa.TOPICS.Topic4.practice;

class Music extends Thread {
    public void print() throws InterruptedException{
        synchronized (Music.class) {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " - " + i);
            }
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

public class SyncBlockPractice_05072026 {
    public static void main(String[] args) {
        Music m1 = new Music();
        m1.setName("c1");
        m1.start();

        Music m2 = new Music();
        m2.setName("c2");
        m2.start();
    }

}
