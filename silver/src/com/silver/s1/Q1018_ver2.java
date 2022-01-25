package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1018_ver2 {
//체스판 다시 칠하기 // toCharArray() 이용 단축
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int sero = Integer.parseInt(st.nextToken());
		int garo = Integer.parseInt(st.nextToken());	
		char [][] cha = new char[sero][garo];	
		for(int i=0;i<cha.length;i++) {
			cha[i] = br.readLine().toCharArray();
		}	
		int min=64;
		for(int i=0;i<=sero-8;i++) {
			for(int j=0;j<=garo-8;j++) {				
				//B시작
				int idxB=0;//B시작, 틀린 횟수
				int idxW=0;
				for(int l =0;l<8;l++) {
					for(int k=0;k<8;k++) {
						boolean a = (cha[i+l][j+k] == 'B');
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
	}
}
