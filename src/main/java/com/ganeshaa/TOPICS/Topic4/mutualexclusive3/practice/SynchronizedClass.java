package com.ganeshaa.TOPICS.Topic4.mutualexclusive3.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Playlist1 {
    static synchronized void music() throws InterruptedException {
        List<String> musicList = new ArrayList<>();
        musicList.add("tum ho");
        musicList.add("wajah");
        musicList.add("bajrangbali");
        musicList.add("noor");
        musicList.add("backup");

        ListIterator<String> listIterator = musicList.listIterator();
        while (listIterator.hasNext()) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " - " + listIterator.next());
        }
    }
}

class MyThread1 extends Thread {
    public void run() {
        Playlist1 p1 = new Playlist1();
        Playlist1 p2 = new Playlist1();
        try {
            p1.music();
            p2.music();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class SynchronizedClass {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread1 t2 = new MyThread1();
        t2.start();
    }
}

