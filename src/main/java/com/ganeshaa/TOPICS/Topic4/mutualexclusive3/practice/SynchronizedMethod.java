package com.ganeshaa.TOPICS.Topic4.mutualexclusive3.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Playlist {
    synchronized void music() throws InterruptedException {
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

class MyThread extends Thread {
    private Playlist playlist;

    // Constructor to set the shared playlist
    public MyThread(Playlist playlist) {
        this.playlist = playlist;
    }

    public void run() {
        try {
            playlist.music();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {
        Playlist p1 = new Playlist();
        
        MyThread t1 = new MyThread(p1);
        t1.start();

        MyThread t2 = new MyThread(p1);
        t2.start();
    }
}
