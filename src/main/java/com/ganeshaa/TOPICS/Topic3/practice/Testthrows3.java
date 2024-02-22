package com.ganeshaa.TOPICS.Topic3.practice;

import java.io.IOException;

class M{
    void method()throws IOException {
//        System.out.println("device operation performed");
        throw new IOException("device operation performed");
    }
}
class Testthrows3{
    public static void main(String args[])throws IOException{//declare exception
        M m=new M();
        m.method();

        System.out.println("normal flow...");
    }
}
