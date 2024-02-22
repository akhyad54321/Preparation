package com.ganeshaa.prepInsta.arrays;

public class SumArray {
	public static void main(String[] args) {
		int [] arr = {1,10,23,43,12,34,54,23,12,78};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
