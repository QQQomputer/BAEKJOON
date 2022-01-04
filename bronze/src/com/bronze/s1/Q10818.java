package com.bronze.s1;

import java.util.Scanner;

public class Q10818 {
//최소, 최대
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] a = new int[n];
		int b = 0;
		int max = -1000001;
		int min = 1000001;

		for (int i = 0; i < a.length; i++) {
			a[i] = b;
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min + " " + max);
	}

}
