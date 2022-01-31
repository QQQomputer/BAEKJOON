package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1065 {
//한수
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());		
		int idx=0;		
		for(int i = 1;i<=n;i++) {
			if(i<100) {
				idx++;
			}else if(i<1000){
				if(i/100-i%100/10==i%100/10-i%10) {
					idx++;
				}
			}			
		}
		bw.write(idx+"\n");
		bw.flush();
		bw.close();
	}
}
