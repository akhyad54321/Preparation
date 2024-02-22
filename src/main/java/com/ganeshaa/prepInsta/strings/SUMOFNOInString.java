package com.ganeshaa.prepInsta.strings;

public class SUMOFNOInString {
	public static void main(String[] args) {
		
		String str = "Akhilesh65423Yadav";
		
		String no = "";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch >= '1' && ch <= '9') {
				no = no + ch;
			}
		}
		
		System.out.println(no);
		System.out.println(no.getClass());
		
		System.out.println("==================================");
		int num = Integer.parseInt(no);
		System.out.println(num);
		int sum = 0;
		
		while(num !=0) {
			int d = num % 10;
			sum =sum + d;
			num = num / 10;
		}
		
		System.out.println("sum = " + sum);
	
		
	}
}
