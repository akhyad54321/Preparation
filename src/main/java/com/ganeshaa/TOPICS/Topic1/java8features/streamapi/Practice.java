package com.ganeshaa.TOPICS.Topic1.java8features.streamapi;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(10, 20, 30, 40, 50, 23, 34, 56, 76, 6, 7);
		List<String> list1 = List.of("Akhilesh", "Akash", "Raju", "Shyam");
		
		
		Map<Integer, Integer> collect = list.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(collect);
		
		Map<String, String> collect2 = list1.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(collect2);
		
	}
}
