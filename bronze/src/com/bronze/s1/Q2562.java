package com.bronze.s1;

import java.util.Scanner;

public class Q2562 {
//최댓값
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[9];

		for (int i = 0; i < 9; i++) {
			num[i] = sc.nextInt();
		}

//		max
//		count 안쓰고 idx

		int idx = 0;

		for (int i = 1; i < 9; i++) {
			if (num[i] > num[idx]) {
				idx = i;
//				max = num[i];
//				count = i+1;		
			}
		}
		System.out.println(num[idx]);
		System.out.println(idx + 1);

	}

}
