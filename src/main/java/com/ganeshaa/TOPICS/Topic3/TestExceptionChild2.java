package com.ganeshaa.TOPICS.Topic3;

class Parent2{    
	  void msg()throws Exception {  
	    System.out.println("parent method");  
	  }    
	}    
	    
	public class TestExceptionChild2 extends Parent2{    
	  void msg()throws ArithmeticException {  
	    System.out.println("child method");  
	  }    
	    
	  public static void main(String args[]) {    
	   Parent2 p = new TestExceptionChild2();    
	     
	   try {    
	   p.msg();    
	   }  
	   catch (Exception e){}   
	  
	  }    
	} 