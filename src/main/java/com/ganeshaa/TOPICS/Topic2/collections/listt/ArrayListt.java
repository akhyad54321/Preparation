package com.ganeshaa.TOPICS.Topic2.collections.listt;

import java.util.ArrayList;
import java.util.Iterator;

class Book {
    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Book [id=" + id + ", name=" + name + "]";
    }


}

public class ArrayListt {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<Book>();
        Book b1 = new Book(101, "Let us C");
        Book b2 = new Book(102, "Data Communications");
        Book b3 = new Book(103, "Operating System");

        list.add(b1);
        list.add(b2);
        list.add(b3);

//        for (Book book : list) {
//            System.out.println(book.id + book.name);
//        }
//
//        System.out.println("---------------");

//        list.forEach(e -> {
//            System.out.println(e);
//        });

//        =============================


        Iterator<Book> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
