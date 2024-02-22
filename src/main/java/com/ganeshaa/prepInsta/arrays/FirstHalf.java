package com.ganeshaa.prepInsta.arrays;

public class FirstHalf {
	public static void main(String[] args) {
		int [] arr = {1,10,23,43,12,34,54,26,13,78};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("******First Half*****");
		for(int i=0; i<arr.length/2; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("******Second Half*****");
		for(int i=arr.length-1; i>=arr.length/2; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("******Final*****");
		for(int i=0; i<arr.length/2; i++) {
			System.out.print(arr[i] + " ");
		}
		for(int i=arr.length-1; i>=arr.length/2; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
