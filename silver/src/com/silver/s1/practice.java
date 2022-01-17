package com.silver.s1;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
//		String str = "123456789";
//		System.out.println(str.substring(0, 4));
//		str = "push 123";
//		System.out.println(str.substring(5));
//		System.out.println(str.length());
//		
//		int input = 10;
//		int [] room = new int[input];		
//		System.out.println(room.length);
		Scanner sc = new Scanner(System.in);
		int input = Integer.parseInt(sc.nextLine());
		int [] a = new int[input];

		for(int i=0;i<a.length;i++) {
			String str = sc.next();
			System.out.println(i);
		}
		
		
		
	}

}
