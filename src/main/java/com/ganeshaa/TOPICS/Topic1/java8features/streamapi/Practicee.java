package com.ganeshaa.TOPICS.Topic1.java8features.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class Practicee {
	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,23,45,43,67,88,98);
		List<String> list1 = List.of("Akhilesh", "Sanket", "Vimlesh", "Akhil");
		
//		list.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(e->{System.out.println(e);});
//		
//		Stream<Integer> stream = list.stream();
//		List<Integer> collect = stream.filter(i->i%3==0).collect(Collectors.toList());
//		System.out.println(collect);
//		
//		List<Integer> collect2 = list.stream().map(i->i*i).collect(Collectors.toList());
//		System.out.println(collect2);
//		
//		List<Integer> collect3 = list.stream().sorted().limit(2).collect(Collectors.toList());
//		System.out.println(collect3);
		
		List<Integer> collect = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
//		list.stream().filter(e->e%3==0).collect(Collectors.toList()).forEach(i->System.out.println(i));
//		list.stream().filter(i->i%2==0).collect(Collectors.toList()).forEach(i->{System.out.println(i);});
		
		List<Integer> collect2 = list.stream().map(i->i*i*i).collect(Collectors.toList());
		System.out.println(collect2);
		
		List<Integer> collect3 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect3);
		
		List<Integer> collect4 = list.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(collect4);
		System.out.println("========================================");
		
		
//		List<String> collect4 = list1.stream().filter(i->i.startsWith("A")).collect(Collectors.toList());
//		System.out.println(collect4);
//		
//		List<String> collect5 = list1.stream().map(i->i.replace("A", "B")).collect(Collectors.toList());
//		System.out.println(collect5);
//		
//		List<String> collect6 = list1.stream().sorted().limit(2).collect(Collectors.toList());
//		System.out.println(collect6);
		
		List<String> collect5 = list1.stream().filter(i->i.startsWith("A")).collect(Collectors.toList());
		System.out.println(collect5);
		
		List<String> collect6 = list1.stream().filter(i->i.endsWith("h")).collect(Collectors.toList());
		System.out.println(collect6);
		
		List<String> collect7 = list1.stream().map(i->i.replace("A", "Z")).collect(Collectors.toList());
		System.out.println(collect7);
		
		List<String> collect8 = list1.stream().sorted().limit(3).collect(Collectors.toList());
		System.out.println(collect8);
	}
}
