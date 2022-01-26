package com.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2805 {
//나무 자르기
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n= Integer.parseInt(st.nextToken());
		long m = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int [] arr = null;
		int h = 0;
		int amount;
		//int mod = 1000000007;
		arr = new int[n];
		for(int i =0; i<n;i++) {
			arr[i] = (int)(Long.parseLong(st.nextToken()));		//%mod	
		}
		boolean flag = true;
		while(flag) {	
			amount =0;
			for(int i =0; i<n;i++) {
				if(arr[i]>h) {
					amount +=((arr[i]-h));
				}		
			}

			if(amount<=m) {
				flag = false;
			}
			h++;
		}
		System.out.println(--h);
	
	}

}