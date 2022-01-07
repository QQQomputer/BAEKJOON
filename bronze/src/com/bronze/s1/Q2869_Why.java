package com.bronze.s1;

import java.util.Scanner;

public class Q2869_Why {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt(); 
		int v = sc.nextInt();		
		int day = (v-b)/(a-b);		
		if((v-b)%(a-b)!=0) {
			day++;
		}
		System.out.println(day);
	}
}
