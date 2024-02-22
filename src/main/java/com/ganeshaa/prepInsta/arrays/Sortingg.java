package com.ganeshaa.prepInsta.arrays;

public class Sortingg {
	public static void main(String[] args) {
		
		int [] arr = {1,10,23,43,12,34,54,23,12,78};
		int temp;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i : arr) {
			System.out.print(i + " ");
			}
		System.out.println();
		System.out.println("2nd Highest = " + arr[1]);

	}
}
