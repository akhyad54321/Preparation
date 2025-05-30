package com.ganeshaa.TOPICS.Topic2.comparator.practice;

import java.util.Comparator;

public class IdComparator implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2){
        return b1.id - b2.id;
    }
}
