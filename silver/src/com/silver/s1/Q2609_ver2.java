package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2609_ver2 {
	// 최대공약수와 최소공배수
	// lcm 최소공배수
	// gcd 최대공약수

	public static int[] divisor(int d) {
		int start = d;
		int[] arr = new int[10001];
		for (int i = 2; i <= d; i++) {
			while (start % i == 0) {
				arr[i]++;
				start /= i;
			}
			if (start == 1)
				break;
		}
		return arr;
	}

	public static int lcm(int n, int m) {

		int[] dn = divisor(n);
		int[] dm = divisor(m);
		int[] sum = new int[dn.length];
		int lcm = 1;
		int num = 0;

		if (n > m)
			num = n;
		else {
			num = m;
		}
		for (int i = 2; i <= num; i++) {
			if (dn[i] - dm[i] >= 0) {
				sum[i] = dn[i] - dm[i];
			} else {
				sum[i] = dm[i] - dn[i];
			}
			if (sum[i] != 0) {
				for (int j = 0; j < sum[i]; j++)
					lcm *= i;
			}
		}
		lcm = lcm * gcd(n, m);
		return lcm;
	}

	public static int gcd(int n, int m) {

		int[] dn = divisor(n);
		int[] dm = divisor(m);
		int[] sum = new int[dn.length];
		int gcd = 1;
		int num = 0;

		if (n > m)
			num = m;
		else {
			num = n;
		}

		for (int i = 2; i <= num; i++) {
			if (dn[i] >= dm[i]) {
				sum[i] = dm[i];
			} else {
				sum[i] = dn[i];
			}
			if (sum[i] != 0) {
				for (int j = 0; j < sum[i]; j++)
					gcd *= i;
			}
		}

		return gcd;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		bw.write(gcd(n, m) + "\n");
		bw.write(lcm(n, m) + "\n");
		bw.flush();
		bw.close();

	}

}
