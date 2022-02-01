package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1978 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
//		Scanner sc =new Scanner(System.in);		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st =new StringTokenizer(br.readLine());
		int idx=0;
		int a=0;
		for(int i = 0;i<count;i++) {			
			a = Integer.parseInt(st.nextToken());
			int sqrt = (int)Math.sqrt(a);
			if(a<2) {				
			}else if(a==2 || a==3) {
				idx++;
			}else {
				for(int j=2;j<=sqrt;j++) {
					
					if(a%j==0) {
						break;
					}
					if(j==sqrt) {
						idx++;
					}					
				}
			}					
		}
		System.out.println(idx);
	}

}
