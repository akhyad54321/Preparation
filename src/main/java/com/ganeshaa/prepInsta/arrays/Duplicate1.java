package com.ganeshaa.prepInsta.arrays;

public class Duplicate1 {
	public static void main(String[] args) {
		
		int [] arr = {10,2,33,4,2,10,33};
//		int [] arr1 = new int[arr.length];
				
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[j] + " ");
				}
			}
		}
	}
}
