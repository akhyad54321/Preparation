package com.ganeshaa.TOPICS.Topic2.collections.listt;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Demo1V {
	public static void main(String[] args) {
		
		Vector<Integer> in = new Vector<>();
			in.add(100);  
	        in.add(200);  
	        in.add(300);  
	        in.add(200);  
	        in.add(400);  
	        in.add(500);  
	        in.add(600);  
	        in.add(700);  
	        
//	        System.out.println(in);
	        
	        System.out.println("using iterator");
	        Iterator<Integer> itr1 = in.iterator();
	        while(itr1.hasNext()) {
	        	System.out.println(itr1.next());
	        }
	        
	        System.out.println("using listiterator : ");
	        ListIterator<Integer> itr2 = in.listIterator();
	        while(itr2.hasNext()) {
	        	System.out.println(itr2.next());
	        }
	        
	        System.out.println("using enumeration : ");
	        Enumeration<Integer> itr3 = in.elements();
	        while(itr3.hasMoreElements()) {
	        	System.out.println(itr3.nextElement());
	        }
	       
	        
	        System.out.println("using for-each : ");
	        for(Integer integer : in) {
	        	System.out.println(integer);
	        }
	        
	        System.out.println("using forEach java 8");
	        in.forEach(e->{
	        	System.out.println(e);
	        });
	}
}
