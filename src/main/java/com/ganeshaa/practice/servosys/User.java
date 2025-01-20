package com.ganeshaa.practice.servosys;

public class User {
    private static User user;
    private User(){
        if (user != null){
            throw new RuntimeException("U R TRYING TO BREAK SINGLETON PATTERN");
        }

    }

    public static User getUser(){
        if (user == null){
            user = new User();
        }
        return user;
    }
}
