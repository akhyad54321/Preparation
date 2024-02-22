package com.ganeshaa.TOPICS.Topic1.java8features.streamapi.practice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

    private int id;
    private String name;
    private String location;
}
