package com.bronze.s1;

import java.util.Scanner;

public class Q2884 {
//알람 시계
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// H 24
		// M 59
		// m <15 => m+45
		// m>15 => m-15 H+1

		int h = sc.nextInt();
		int m = sc.nextInt();

		if (m > 15) {
			m -= 45;
		} else {
			m += 15;
			h -= 1;
		}
		System.out.print(h + " ");
		System.out.println(m);

	}

}
