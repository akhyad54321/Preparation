package com.ganeshaa.TOPICS.Topic4.mutualexclusive.practice;

class Book {
    void show() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " - " + "Hi");
        System.out.println(Thread.currentThread().getName() + " - " + "Hi");
        System.out.println(Thread.currentThread().getName() + " - " + "Hi");
        System.out.println(Thread.currentThread().getName() + " - " + "Hi");
        System.out.println(Thread.currentThread().getName() + " - " + "Hi");

        synchronized (this){
            for (int i = 0; i < 5; i++) {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " - " + "Ganeshaa");
            }
        }

        System.out.println(Thread.currentThread().getName() + " - " + "Hello");
        System.out.println(Thread.currentThread().getName() + " - " + "Hello");
        System.out.println(Thread.currentThread().getName() + " - " + "Hello");
        System.out.println(Thread.currentThread().getName() + " - " + "Hello");
        System.out.println(Thread.currentThread().getName() + " - " + "Hello");

    }
}

class Mthread extends Thread {
    private Book book;
    public Mthread(Book b1){
        this.book = b1;
    }
    public void run() {
        try {
            book.show();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        Book b1 = new Book();
        Mthread t1 = new Mthread(b1);
        t1.start();

        Mthread t2 = new Mthread(b1);
        t2.start();
    }
}
