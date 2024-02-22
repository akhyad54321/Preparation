package com.ganeshaa.TOPICS.Topic3.practice;

import java.io.IOException;

class Testthrows1{
    void m()throws IOException {
        throw new IOException("device error");//checked exception
    }
    void n()throws IOException{
        m();
    }
    void p() throws IOException {
            n();
    }
    public static void main(String args[]) throws IOException {
        Testthrows1 obj=new Testthrows1();
        obj.p();
        System.out.println("normal flow...");
    }
}
