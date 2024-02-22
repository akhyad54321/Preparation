package com.ganeshaa.prepInsta.arrays;

public class FrequencyofEachElement {
	public static void main(String[] args) {
		int [] arr = {1,10,23,43,12,34,54,23,12,78};
		int [] arr1 = new int[arr.length];
		int [] arr2 = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr1[i] = arr[i];
				}
				else {
					arr2[i] = arr[i];
				}
			}
		}
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}
}
