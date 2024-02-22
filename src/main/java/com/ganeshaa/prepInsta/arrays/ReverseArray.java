package com.ganeshaa.prepInsta.arrays;

public class ReverseArray {
	public static void main(String[] args) {
		
		int [] arr = {1,10,23,43,12,34,54,23,12,78};
		int [] arr1 = new int[arr.length];
		
//		for(int i=arr.length-1; i>=0; i--) {
//			System.out.print(arr[i] + " ");
//		}
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
