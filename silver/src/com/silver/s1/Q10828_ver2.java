package com.silver.s1;

import java.util.Scanner;

public class Q10828_ver2 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); // ¼±¾ð
		int idx =0;
		int input = Integer.parseInt(sc.nextLine());
		//int input = sc.nextInt();
		int [] room = new int[input];
		for(int i=0;i<room.length;i++) {
			String str= sc.nextLine().trim();
		
			if(str.equals("pop")) {//=================================
				
				if(idx==0) {
					System.out.println("-1");
				}else {
					idx--;
					System.out.println(room[idx]);					
				}
			}else if(str.equals("top")) {//=================================
				if(idx==0) {
					System.out.println("-1");
				}else {
					System.out.println(room[idx-1]);
				}
				
			}else if(str.equals("size")) {//=================================
				System.out.println(idx);
			}else if(str.equals("empty")) {//=================================
				if(idx==0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
			}else if(str.length()>=6) {//=================================
				int a= Integer.parseInt(str.substring(5));				
				room[idx]=a;
				idx++;
			}
		}		
	}	
}





