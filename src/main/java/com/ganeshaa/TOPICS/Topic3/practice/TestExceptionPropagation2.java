package com.ganeshaa.TOPICS.Topic3.practice;

import java.io.IOException;

class TestExceptionPropagation2{
    void m() throws IOException {
        throw new IOException("device error");//checked exception
    }
    void p(){
        try{
            m();
        }catch(Exception e){System.out.println("exception handeled");}
    }
    public static void main(String args[]){
        TestExceptionPropagation2 obj=new TestExceptionPropagation2();
        obj.p();
        System.out.println("normal flow");
    }
}
