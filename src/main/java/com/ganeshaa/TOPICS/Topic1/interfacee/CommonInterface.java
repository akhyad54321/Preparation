package com.ganeshaa.TOPICS.Topic1.interfacee;

interface Int1{
    void music();
}
interface  Int2{
    void music();
}

public class CommonInterface implements Int1, Int2{
    public static void main(String[] args) {
        Int1 i1 = new CommonInterface();
        i1.music();
    }

    @Override
    public void music() {
        System.out.println("Hello");
    }
}
