package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q1018 {
//체스판 다시 칠하기
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String num = br.readLine();
		int sero = Integer.parseInt(num.split(" ")[0]);
		int garo = Integer.parseInt(num.split(" ")[1]);		
		String [] str = new String[sero];		
		for(int i=0;i<str.length;i++) {
			str[i] = br.readLine();
		}	
		int min=64;
		for(int i=0;i<=sero-8;i++) {
			for(int j=0;j<=garo-8;j++) {				
				//B시작
				int idxB=0;//B시작, 틀린 횟수
				int idxW=0;
				for(int l =0;l<8;l++) {
					for(int k=0;k<8;k++) {
						boolean a = str[i+l].substring(j+k, j+k+1).equals("B");
						if(k%2==l%2) {	
							if(a) {
								idxW++;
							}else {
								idxB++;
							}
						}else if(k%2 != l%2) {
							if(a) {
								idxB++;
							}else {
								idxW++;
							}
						}

					}
				}
				
				if(min>idxW) {
					min = idxW;
				}
				if(min>idxB) {
					min = idxB;
				}
			}
		}
		bw.write(min+"\n");
		bw.flush();
		bw.close();
//		System.out.println("MIN : "+min);
	}

}
