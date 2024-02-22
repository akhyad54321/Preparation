package com.ganeshaa.TOPICS.Topic1.java8features.streamapi;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,22,13,15,66,56,67,87,88,89,100);
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		
		Stream<Integer> stream = list.stream();
		List<Integer> collect = stream.map(i->i*i).collect(Collectors.toList());
		System.out.println(collect);
		
		System.out.println("----");
		list.stream().map(i->i*i*i).collect(Collectors.toList()).forEach(i->System.out.println(i));
	
		List<Integer> collect2 = set.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(collect2);
	}
}
