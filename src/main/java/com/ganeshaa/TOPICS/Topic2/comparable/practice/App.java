package com.ganeshaa.TOPICS.Topic2.comparable.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class User {
    private int id;
    private String name;

    public User() {
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}

public class App {
    public static void main(String[] args) {

        List<User> list = new ArrayList<>();
        User u1 = new User(1, "Akhilesh");
        User u2 = new User(3, "Akash");
        User u3 = new User(2, "Sameer");
        User u4 = new User(5, "Kunal");
        User u5 = new User(4, "Sai");

        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        list.add(u5);

        Collections.sort(list, new IdComparator());
        Collections.sort(list, new NameComparator());
        Iterator<User> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
