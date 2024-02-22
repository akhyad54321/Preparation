package com.ganeshaa.prepInsta.arrays;

import java.util.HashMap;

public class FrequencyAkash {
	public static void main(String[] args) {
		
		int arr[]= {34,57,24,97,21,34,34,57,86,24,24,24,24,24};
		HashMap<Integer, Integer> map = new HashMap<>();
//		int count = 1;
		
		for(int i=0; i<arr.length; i++) {
			int count = 1;
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			map.putIfAbsent(arr[i], count);
//			count = 1;
		}
		System.out.println(map);
	}
}

//{97=1, 34=3, 21=1, 86=1, 24=6, 57=2} putIfAbsent
//{97=1, 34=1, 21=1, 86=1, 24=1, 57=1} put