package com.ganeshaa.TOPICS.Topic1.java8features.streamapi;//package com.neosoft.java8features.streamapi;
//
//import java.util.HashSet;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Demo1 {
//	public static void main(String[] args) {
//		List<Integer> list = List.of(1,23,45,43,67,88,98);
//		HashSet<Integer> set = new HashSet<>(list);
//		//HashMap<Integer, Integer> map = new HashMap<>(set,set);
////		Map<Integer, Integer> collect = list.stream().collect(Collectors.toMap(Function.identity(), Function.identity()));
////		System.out.println(collect);
//
//		Stream<Integer> stream = list.stream();
//		List<Integer> collect = stream.filter(i->i%2==0).collect(Collectors.toList());
//		System.out.println(collect);
//
//		List<Integer> collect2 = list.stream().filter(i->i%3==0).collect(Collectors.toList());
//		System.out.println(collect2);
//
//		System.out.println("-----");
//		list.stream().filter(e->e%4==0).collect(Collectors.toList()).forEach(i->System.out.println(i));
//
//		System.out.println("==========");
//		Stream<Integer> stream2 = set.stream();
//		stream2.filter(i->i%2==0).collect(Collectors.toList()).forEach(i->System.out.println(i));
//		System.out.println("==========");
//
//		set.stream().filter(i->i%3==0).collect(Collectors.toList()).forEach(i->System.out.println(i));
//	}
//}
