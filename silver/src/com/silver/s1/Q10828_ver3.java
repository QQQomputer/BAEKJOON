package com.silver.s1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10828_ver3 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);  
		int idx =0;
		int input = sc.nextInt();

		int [] room = new int[input];
		ArrayList<String> b = new ArrayList<>();
		
		for(int i=0;i<room.length;i++) {

			String str= sc.next();
		
			if(str.equals("push")) {//=================================
				int a= sc.nextInt();				
				room[idx]=a;
				idx++;
			}else if(str.equals("pop")) {//=================================
				
				if(idx==0) {
					b.add("-1");					
				}else {
					idx--;
					b.add(""+room[idx]);			
				}
			}else if(str.equals("top")) {//=================================
				if(idx==0) {
					b.add("-1");
				}else {
					b.add(""+room[idx-1]);
				}
				
			}else if(str.equals("size")) {//=================================
				b.add(""+idx);
			}else if(str.equals("empty")) {//=================================
				if(idx==0) {
					b.add("1");
				}else {
					b.add("0");
				}
			}
//			System.out.println(i+"==================");			
		}
		
		for(int i = 0;i<b.size();i++) {
			System.out.println(b.get(i));			
		}
	}	
}





