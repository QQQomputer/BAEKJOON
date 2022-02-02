package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2609 {
//최대공약수와 최소공배수	
	//lcm 최소공배수
	//gcd 최대공약수
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int idx1=0;
		int idx2=0;
		//최대공약수
		if(n>m) {
			for(int i=m;i>0;i--) {
				if(n%i ==0 &&m%i==0) {
					idx1=i;
					break;
				}
			}
		}else {
			for(int i=n;i>0;i--) {
				if(n%i ==0 &&m%i==0) {
					idx1=i;
					break;
				}
			}
		}
		
		//최소공배수
		if(n>m) {
			for(int i=n;i<10001;i++) {
				if(i%n ==0 &&i%m==0) {
					idx2=i;
					break;
				}
			}
		}else {
			for(int i=m;i<10001;i++) {
				if(i%n ==0 &&i%m==0) {
					idx2=i;
					break;
				}
			}
		}		
		
		bw.write(idx1+"\n");
		bw.write(idx2+"\n");
		bw.flush();
		bw.close();
	}

}
