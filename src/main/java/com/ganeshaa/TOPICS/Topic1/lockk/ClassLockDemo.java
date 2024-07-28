package com.ganeshaa.TOPICS.Topic1.lockk;

public class ClassLockDemo {

    public static synchronized void method1() {
        for (int i = 0; i < 5; i++)
            try {
                System.out.println("static synchronized method1");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public void method2() {
        System.out.println("method2");
    }

    public static synchronized void method3() {
        for (int i = 0; i < 5; i++)
            try {
                System.out.println("static synchronized method3");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

    public synchronized void method4() {
        for (int i = 0; i < 5; i++)
            try {
                System.out.println("synchronized method4");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public synchronized void method5() {
        for (int i = 0; i < 5; i++)
            try {
                System.out.println("synchronized method5");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public void method6() {
        for (int i = 0; i < 5; i++)
            try {
                System.out.println("method6");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }

}

