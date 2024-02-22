package com.ganeshaa.TOPICS.Topic3.throwss;

class Parentt{
	void Driver() throws ClassNotFoundException{
		Class c = Class.forName("com.mysql.cj.jdbc.Driver");
	}
	
}
public class Testt {
	
	public static void main(String[] args)  {
		Parentt parentt = new Parentt();
		try {
			
			parentt.Driver();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("End : ");
		
	}
	
}
