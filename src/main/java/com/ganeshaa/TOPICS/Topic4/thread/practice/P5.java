package com.ganeshaa.TOPICS.Topic4.thread.practice;

public class P5 extends Thread{
    public static void main(String[] args) {
         Runnable runnable = ()->{
             for (int i=0; i<3; i++){
                 System.out.println(Thread.currentThread().getName());
             }
         };

         Thread thread = new Thread(runnable);
         thread.start();
    }

}
