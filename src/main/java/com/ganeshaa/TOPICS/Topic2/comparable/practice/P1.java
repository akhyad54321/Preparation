package com.ganeshaa.TOPICS.Topic2.comparable.practice;


import jakarta.annotation.sql.DataSourceDefinitions;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;

@Data
@NoArgsConstructor
@AllArgsConstructor
class Book implements Comparable<Book>{
    private int id;
    private String name;

    @Override
    public int compareTo(Book book){
        return this.name.compareTo(book.name);
    }

//    @Override
//    public int compareTo(Book book){
//        return this.id - book.id;
//    }
}
public class P1 {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<>();
        Book b1 = new Book(1, "Akhilesh");
        Book b2 = new Book(2, "Sameer");
        Book b3 = new Book(3, "Akash");
        Book b4 = new Book(4, "Piyush");

        list.add(b1); list.add(b2); list.add(b4); list.add(b3);

        Collections.sort(list);

        for (Book book : list){
            System.out.println(book.getId() + " - " + book.getName());
        }
    }
}
