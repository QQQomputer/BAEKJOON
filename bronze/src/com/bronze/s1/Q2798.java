package com.bronze.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2798 {
//블랙잭
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int max =0;
		int sum =0;
		for(int i=0;i<arr.length;i++) {			
			for(int j=i+1;j<arr.length;j++) {				
				for(int k=j+1;k<arr.length;k++) {
					sum=arr[i]+arr[j]+arr[k];
					if(m>=sum&&max<sum) {
						max = sum;
					}					
				}
			}
		}	
		bw.write(max+"\n");
		bw.flush();
		bw.close();
	}
}
