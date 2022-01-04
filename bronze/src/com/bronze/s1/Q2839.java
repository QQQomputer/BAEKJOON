package com.bronze.s1;

import java.util.Scanner;

public class Q2839 {
//º≥≈¡ πË¥ﬁ

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int min = 5001;
		boolean flag = true;

		for (int i = 0; i < n / 5 + 1; i++)
			for (int j = 0; j < n / 3 + 1; j++) {
				if (n == i * 5 + j * 3) {
					if (min > i + j) {
						min = i + j;
					}
					flag = false;
				}
			}
		if (flag) {
			min = -1;
		}
		System.out.println(min);
		System.out.println(flag);
	}
}
