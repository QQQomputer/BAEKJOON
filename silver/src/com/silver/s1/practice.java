package com.silver.s1;

import java.util.ArrayList;
import java.util.Scanner;

public class practice {
	static ArrayList<Integer> arr = new ArrayList<>();
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
//		 int [] room = new int[2];
//		 room[0]=1;
//		 room[1]=2;
//		sb.append(room[0]).append("\n").append("\n")
//		sb.append(room[1]).append("\n");
//		System.out.println(sb);
		
		
//		Double n = Double.valueOf("3.0");
//		int a= 10;
//		System.out.println(n+a);
		
//		StringBuilder sb = new StringBuilder();
//		sb.indexOf("hi");
//		System.out.println(sb);
		
		
		ArrayList<Integer> ar = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		ar.add(3);
		hi();
		System.out.println(arr);
		System.out.println(ar);
		ar.add(0,4);
		System.out.println(ar);
		System.out.println(arr.get(0));
		ar.clear();
		System.out.println(ar.isEmpty());

	}
	public static void hi() {
		arr.add(5);
	}

}
