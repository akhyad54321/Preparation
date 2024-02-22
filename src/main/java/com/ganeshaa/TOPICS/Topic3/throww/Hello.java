package com.ganeshaa.TOPICS.Topic3.throww;

class Parent{
	
	Parent(){
		System.out.println("parent default");
	}
	Parent(String name){
		System.out.println("parent parameterized");
	}
}
 class Child extends Parent{
	 Child(){
		 this("akash");
			System.out.println("child default");
		}
	 Child(String name){
		 super("akash");
			System.out.println("child parameterized");
		}
 }

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child=new Child();
//		Child c1 = new Child("Akhilesh");
//		Parent p1 = new Parent();

	}

}
