package com.ganeshaa.TOPICS.Topic1.java8features.streamapi;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo4 {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(10,20,30,40,50,23,34,56,76,6,7);
		
		List<String> list1 = List.of("Akhilesh", "Akash", "Raju", "Shyam");
		
		System.out.println("List");
		
		Stream<Integer> stream = list.stream();
		Map<Integer, Integer> collect = stream.collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(collect);
		
		System.out.println("-------");
		
		Stream<Integer> stream2 = list.stream();
		Map<Integer, Integer> collect2 = stream2.collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(collect2);
		
		Stream<String> stream3 = list1.stream();
		Map<String, String> collect3 = stream3.collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(collect3);
		
		Map<String, String> collect4 = list1.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(collect4);
		
		System.out.println("----------");
		
		Set<Integer> collect5 = list.stream().collect(Collectors.toSet());
		System.out.println(collect5);
	}
}
