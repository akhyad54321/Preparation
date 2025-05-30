package com.ganeshaa.TOPICS.Topic2.collections.mapp.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Book{
    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        Book b1 = (Book)o;
        return this.id == b1.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
public class P2 {
    public static void main(String[] args) {
        HashMap<Book, Integer> map = new HashMap<>();
        Book b1 = new Book(1, "b1");
        Book b2 = new Book(2, "b2");
        Book b3 = new Book(3, "b3");
        Book b4 = new Book(3, "b4");

        map.put(b1, 10);
        map.put(b2, 20);
        map.put(b3, 30);
        map.put(b4, 40);

        map.forEach((k,v)-> System.out.println(k+ " - " + v));
    }
}
