package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2609_verEuclidean {
//유클리드 호제법
//	public static int gcd(int a, int b) {
//		if (b == 0)
//			return a;
//		return gcd(b, a % b);
//	}
	public static int Euclidean(int n, int m) {
		
		int x=n;
		int y=m;
		int k=0;
		while(y!=0) {
			k=x%y;
			x=y;
			y=k;
		}			
		return x;
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int x = n;
		int y = m;
		if(n<m) {
			x=m;
			y=n;
		}		
		int gcd = Euclidean(x,y);		
		bw.write(gcd+"\n");
		bw.flush();
		bw.write(n*m/gcd+"\n");
		bw.flush();		
		bw.close();
	}

}
