package com.ganeshaa.TOPICS.Topic3.trycatchfinally;

public class ExceptionUnreachableImp {
    public static void main(String[] args) {
        int a=100, b=0, c;
        try{
            c=a/b;
        }catch (Exception e1){
            System.out.println(e1);
        }
//        catch (ArithmeticException e2){
//            System.out.println(e2);
//        }
    }
}
