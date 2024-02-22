package com.ganeshaa.prepInsta.arrays;

public class FrequencyofEachElement1 {
	public static void main(String[] args) {
		int [] arr = {1,10,23,43,12,34,54,23,12,78, 12};
		int [] arr1 = new int[arr.length];
		int count = 0;
		int k = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					arr1[k] = arr[i]; 
					k++;
			
				}
			}
		}
		System.out.println(count);
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}
}
