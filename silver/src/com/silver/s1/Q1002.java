package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1002 {
//터렛
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		//StringBuilder sb = 
		StringTokenizer st =null;		
		StringBuilder sb = new StringBuilder();
		int x1;
		int y1;
		int r1;
		int x2;
		int y2;
		int r2;
		int xy;
		int r;
		int rm;
		int result;
		for(int i=0;i<t;i++) {
			st = new StringTokenizer(br.readLine());
			result = 0;
			while(st.hasMoreTokens()) {		
				
				x1=Integer.parseInt(st.nextToken());
				y1=Integer.parseInt(st.nextToken());
				r1=Integer.parseInt(st.nextToken());
				x2=Integer.parseInt(st.nextToken());
				y2=Integer.parseInt(st.nextToken());
				r2=Integer.parseInt(st.nextToken());								
				xy = ((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2));
				r = ((r1+r2)*(r1+r2));
				rm = ((r1-r2)*(r1-r2));
				if(xy==0 && rm==0) {
					result = -1;
					break;
				}
				if(xy==r || xy==rm) {
					result=1;
				}else if(xy<r && xy>rm) {
					result=2;
				}else if(xy>r || xy<rm) {
					result=0;
				}
				
			}
			sb.append(result+"\n");
		}		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
