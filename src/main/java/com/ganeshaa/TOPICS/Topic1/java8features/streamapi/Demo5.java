package com.ganeshaa.TOPICS.Topic1.java8features.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Demo5 {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(12,13,45,67,89,76,54,34);
		
		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = list.stream().limit(3).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect3 = list.stream().sorted().limit(5).collect(Collectors.toList());
		System.out.println(collect3);
	}
}
