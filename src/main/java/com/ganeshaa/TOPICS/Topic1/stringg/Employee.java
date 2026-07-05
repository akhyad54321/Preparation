package com.ganeshaa.TOPICS.Topic1.stringg;

import lombok.Data;

@Data
public class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Employee() {
        super();
        // TODO Auto-generated constructor stub
    }


}
