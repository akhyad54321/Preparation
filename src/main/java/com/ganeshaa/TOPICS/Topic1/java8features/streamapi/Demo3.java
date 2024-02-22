package com.ganeshaa.TOPICS.Topic1.java8features.streamapi;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo3 {
	public static void main(String[] args) {
		
		List<String> list = List.of("Akhilesh", "Sameer", "Akash", "Shiv", "Vaishnav", "Pen");
		HashSet<String> set = new HashSet<>(list);
		
		Stream<String> stream = list.stream();
		List<String> collect = stream.filter(i->i.startsWith("A")).collect(Collectors.toList());
		System.out.println(collect);
		
		list.stream().filter(i->i.startsWith("S")).collect(Collectors.toList()).forEach(i->System.out.println(i));
//		System.out.println("=====");
		
		list.stream().filter(e->e.endsWith("h")).collect(Collectors.toList()).forEach(i->System.out.println(i));
		System.out.println("==============");
		
		set.stream().filter(i->i.startsWith("P")).collect(Collectors.toList()).forEach(i->System.out.println(i));
		System.out.println("-----------");
		
		System.out.println("map--->string : ");
		
		Stream<String> stream2 = list.stream();
		List<String> collect2 = stream2.map(i->i.replace("A", "B")).collect(Collectors.toList());
		System.out.println(collect2);
		
		set.stream().map(i->i.toLowerCase()).collect(Collectors.toList()).forEach(i->System.out.println(i));
	
	}
}
