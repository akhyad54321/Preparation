package com.ganeshaa.TOPICS.Topic3.trycatchfinally;

import java.io.FileNotFoundException;
import java.io.IOException;

class Akash{
    static void thokwana() throws FileNotFoundException, IOException{
        System.out.println("sameer acha ladka hai");
    }
}

public class ExceptionSequenceImp {
    public static void main(String[] args) {

        try {
            Akash.thokwana();
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        } catch (FileNotFoundException e1) {
            System.out.println(e1);
        } catch (IOException w) {
            System.out.println(w);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
