package com.ganeshaa.prepInsta.arrays;

public class SmallestLargest {
	public static void main(String[] args) {
		
		int [] arr = {1,10,23,43,12,34,54,23,12,78};
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(min > arr[i]) {
				min =  arr[i];
			}
			if(max < arr[i]) {
				max =  arr[i];
			}
			
		}
		
		System.out.println("min = "  +  min);
		System.out.println("max = " + max);
	}
}
