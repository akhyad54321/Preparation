package com.ganeshaa.TOPICS.Topic2.comparable.practice;

import java.util.Comparator;

public class IdComparator implements Comparator<User> {

    @Override
    public int compare(User u1, User u2){
        return u1.getId() - u2.getId();
    }
}
