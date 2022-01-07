package com.bronze.s1;

import java.util.Scanner;

public class Lab {

    public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		long sum = 0;
		for (int i = 0; i < n; i++) {
			sum += ((str.charAt(i) - 96l) * Math.pow(31l, i)) % 1234567891l;
		}
		System.out.println(sum);
		sc.close();
	}
}
