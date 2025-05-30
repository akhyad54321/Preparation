package com.ganeshaa.TOPICS.Topic2.collections.sett.practice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Iterator;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Book{
    int id;
    String name;

    @Override
    public int hashCode(){
        return id; // if value is false then only it wilol be printed:
    }
    @Override
    public boolean equals(Object o){
        Book b1 = (Book)o;
        return this.id == b1.id;
    }
}
public class P2 {
    public static void main(String[] args) {
        HashSet<Book> set = new HashSet<>();
        Book b1 = new Book(1,"b1");
        Book b2 = new Book(2, "b2");
        Book b3 = new Book(3,"B3");
        Book b4 = new Book(3, "b4");

        set.add(b1); set.add(b2); set.add(b3); set.add(b4);

        Iterator<Book> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
