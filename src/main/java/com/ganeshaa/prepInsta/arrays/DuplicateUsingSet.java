package com.ganeshaa.prepInsta.arrays;

import java.util.HashSet;

public class DuplicateUsingSet {
	public static void main(String[] args) {
		
		int [] arr = {10,2,33,4,2,10,33};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int a : arr) {
			if(set.add(a) == false) {
				System.out.println(a + " ");
			}
		}
		
	}
}
