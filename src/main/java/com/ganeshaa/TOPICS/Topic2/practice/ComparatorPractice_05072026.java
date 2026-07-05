package com.ganeshaa.TOPICS.Topic2.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Book {
    private int id;
    private String name;

}

public class ComparatorPractice_05072026 {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();
        Book b1 = new Book(1, "akh");
        Book b2 = new Book(2, "yog");
        Book b3 = new Book(4, "nil");
        Book b4 = new Book(3, "pakya");
        Book b5 = new Book(5, "njxns");

        list.add(b1);
        list.add(b3);
        list.add(b4);
        list.add(b2);
        list.add(b5);

        Collections.sort(list, new NameComparator());

        for (Book b : list) {
            System.out.println(b);
        }

    }
}
