package com.ganeshaa.TOPICS.Topic4.runnable;

import java.util.concurrent.*;

class Child implements Callable<String>{
	public String call() throws Exception{
		return "Hello";
	}
}
public class CALLABLE1 {
	static ExecutorService executor = Executors.newFixedThreadPool(2);
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Child child = new Child();
		Future<String> message = executor.submit(child);
		System.out.println(message.get().toString());
	}
}
