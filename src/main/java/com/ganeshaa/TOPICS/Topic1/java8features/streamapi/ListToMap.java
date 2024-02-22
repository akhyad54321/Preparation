package com.ganeshaa.TOPICS.Topic1.java8features.streamapi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(12,34,54);
		
		Map<Integer, Integer> collect = list.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(collect);
		
		Map<Integer, Integer> collect2 = list.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
		System.out.println(collect2);
		
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);
		
		System.out.println(map);
		
		List<Integer> collect3 = map.entrySet().stream().map(i->i.getValue()).collect(Collectors.toList());
		
		System.out.println(collect3);
		
		
		}
}
