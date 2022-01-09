package com.bronze.s1;

import java.util.Scanner;

public class Q15829_ver4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		String str = sc.next();

		final long mod = 1234567891;
		long pow = 1;
		long x = 0;

		for (int i = 0; i < z; i++) {
			x += (str.charAt(i) -96) * pow;
			pow = (pow *= 31) % mod;
		}
		System.out.println(x % mod);
	}

}
