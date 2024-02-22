package com.ganeshaa.TOPICS.Topic1.accessmodifier;

class Outer{
	class Inner{
		
		void print() {
			System.out.println("Print : ");
		}
	}
}

public class Demo4 {
	public static void main(String[] args) {

		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();

		inner.print();
	}
}


//OuterClassName outerobject = new OuterClassName(); 
//InnerClassName innerobject = outerobject.new InnerClassName();