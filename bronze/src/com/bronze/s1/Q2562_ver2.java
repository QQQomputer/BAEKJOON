package com.bronze.s1;

import java.util.Scanner;

public class Q2562_ver2 {
//ÃÖ´ñ°ª
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		int idx = 0;
		for (int i = 1; i < 9; i++) {
			int cur = sc.nextInt();
			if (cur > max) {
				max = cur;
				idx = i;
			}
		}
		System.out.println(max);
		System.out.println(idx + 1);

	}

}
