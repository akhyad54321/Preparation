package com.ganeshaa.prepInsta.arrays;

public class FrequencyofEachElementOriginal {
	public static void main(String[] args) {
		
		int [] arr = {23,43,12,34,23,12};
		int [] freq = new int[arr.length];
		
		int visited = -1;
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j] = visited;
				}
			}
			if(freq[i] != visited) {
				freq[i] =count;
			}
		}
		
		System.out.println("===============");
		for(int i=0; i<freq.length; i++) {
			if(freq[i]!= visited) {
				System.out.println(" " + arr[i] + " | " + freq[i]);
			}
		}
		System.out.println("=================");
		
	}
}
