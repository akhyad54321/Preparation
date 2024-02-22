package com.ganeshaa.practice.stringg;

public class FreqOfParticularNo {
    public static void main(String[] args) {
        FreqOfParticularNo freq = new FreqOfParticularNo();
        int frequency = freq.frequency(445678764, 4);
        System.out.println("frequency = " + frequency);
    }

    public int frequency(int num, int freqNum){
        int count = 0;
        String value = String.valueOf(num);
        for (int i=0; i<value.length(); i++){
            char charAt = value.charAt(i);
            if (value.charAt(i) == String.valueOf(freqNum).charAt(0)){
                count++;
            }
        }
        return count;
    }
}
