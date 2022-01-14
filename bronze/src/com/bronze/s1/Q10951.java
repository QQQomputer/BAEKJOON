package com.bronze.s1;

import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		while(sc.hasNextInt()) {

			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0&&b==0) {
				break;
			}
			System.out.println(a + b);
		}
	}
}
