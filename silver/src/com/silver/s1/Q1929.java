package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1929 {
//소수 구하기
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		int [] prime = new int[1000001];
		prime[0]=prime[1]=1;
		for(int i = 2;i<=Math.sqrt(m);i++) {
			if(i==757) {
				System.out.println("hihihihi");
			}
			if(prime[i]!=0) {
				break;
			}//999999
			for(int j =i*i;j<prime.length;j+=i) {
				
				prime[j]++;
			}
		}
//		for(int i=2;i<prime.length;i++) {			
//			if(prime[i]) {
//				continue;
//			}else {
//				for(int j =i*i;j<prime.length;j+=i) {
//					prime[j]=true;
//				}
//			}			
//		}
		System.out.println("=="+prime[999997]);
		for(int i = n;i<=m;i++) {
			if(prime[i]==0)sb.append(i+"\n");
		}
		
		bw.write(sb+"\n");
		bw.flush();
		bw.close();

	}

}
