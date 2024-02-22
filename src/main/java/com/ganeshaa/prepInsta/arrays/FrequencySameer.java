package com.ganeshaa.prepInsta.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencySameer{
	public static void main(String[] args){
		
		System.out.println("............");
		HashMap<Integer, Integer> map = new HashMap<>();
		
		int[] arr= {2,4,2,2,2,2,2,3,5,7,7};
		int size = arr.length;
		
		Arrays.sort(arr);
		
		for(int i=0;i<size;i++) {
			int c=1;
			
			while(i < size -1 && arr[i] == arr[i+1]) {
				i++;
				c++;
			}
			
			map.put(arr[i], c);
		}
		
		
		for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
			
			
			System.out.println(entry.getKey()+":"+entry.getValue());
			
		}
	}
}
