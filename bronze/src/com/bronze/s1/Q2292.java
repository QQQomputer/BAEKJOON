package com.bronze.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2292 {
//벌집
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n=Integer.parseInt(br.readLine());
		int sum =1;//시작 숫자 1
		int idx=0;
		while(true) {			
			sum += 6*idx;//1	7	19	37	
			if(n<=sum) {
				break;
			}			
			idx++;
		}
		bw.write(""+(idx+1));
		bw.flush();
		bw.close();		
	}		
}
