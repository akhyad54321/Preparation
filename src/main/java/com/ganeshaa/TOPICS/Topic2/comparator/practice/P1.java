package com.ganeshaa.TOPICS.Topic2.comparator.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Book {
    int id;
    String name;
}
public class P1 {
    public static void main(String[] args) {
        List<Book>  list = new ArrayList<>();
        Book b1 = new Book(1,"b1");
        Book b2 = new Book(2, "b2");
        Book b3 = new Book(3, "b3");
        Book b4 = new Book(4, "b4");
        Book b5 = new Book(5, "b5");

        list.add(b5);
        list.add(b4);
        list.add(b1);
        list.add(b3);
        list.add(b2);

        Collections.sort(list, new NameComparator());
        ListIterator<Book> itr = list.listIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
