package com.silver.s1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Q10828 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ¼±¾ð
		
		int input = Integer.parseInt(br.readLine());
		int [] room = new int[input];
		int idx =0;
		
		for(int i=0;i<room.length;i++) {
			String str = br.readLine();	
			
			if(str.equals("push")) {
				int a= Integer.parseInt(br.readLine());				
				room[idx]=a;
				idx++;
			}else if(str.equals("pop")) {
				
				if(room[0]==0) {
					System.out.println("-1");
				}else {
					System.out.println(room[idx-1]);
					room[idx-1]=0;
					idx--;
				}
				if(idx<0) {
					idx=0;
				}
			}else if(str.equals("top")) {
				if(room[0]==0) {
					System.out.println("-1");
				}else {
					System.out.println(room[idx-1]);
				}
				
			}else if(str.equals("size")) {
				System.out.println(idx);
			}else if(str.equals("empty")) {
				if(room[0]==0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}			
		}
		
	}	

}





