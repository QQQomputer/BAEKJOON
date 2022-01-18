package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10845 {
//큐
	public static void main(String[] args) throws IOException{
					
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int count = Integer.parseInt(br.readLine());
		int [] room = new int[count];
		int idx=0;
		int data=0;
		for(int i = 0; i<count;i++) {
			String str = br.readLine();
			if(str.length()>=6) {//============================================				
				room[i]=Integer.parseInt(str.substring(5));
//				System.out.println(room[i]+"@hi");
				idx++;
			}else if(str.equals("pop")) {//============================================	
				if(idx==data) {
					sb.append("-1\n");
				}else{
					 sb.append(room[data]+"\n");
					 data++;					 
				}
			}else if(str.equals("size")) {	//============================================				
				sb.append((idx-data)+"\n");			
			}else if(str.equals("empty")) {//============================================	
				if(idx==data) {
					sb.append("1\n");
				}else {
					sb.append("0\n");
				}
			}else if(str.equals("front")) {//============================================	
				if(idx==data) {
					sb.append("-1\n");
				}else {
//					System.out.println(data+"##front");
					sb.append(room[data]+"\n");
				}								
			}else if(str.equals("back")) {//============================================	
				if(idx==data) {
					sb.append("-1\n");
				}else {
					sb.append(room[idx-1]+"\n");
				}	
			}
		}

//		System.out.println("============="+idx);
//		System.out.println("============="+data);
		System.out.println(sb);
//		bw.write(sb);
//		bw.flush();
//		bw.close();
	}	
	
	
//	public void push() {
//		
//	}
//	public void pop() {
//		
//	}
//	public void size() {
//		
//	}
//	public void empty() {
//		
//	}
//	public void front() {
//		
//	}
//	public void back() {
//		
//	}
}