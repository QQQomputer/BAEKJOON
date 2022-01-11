package com.silver.s1;

import java.util.Scanner;

public class Q10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int [] room = new int[input];
		int idx =0;
		
		for(int i=0;i<room.length;i++) {
			String str = sc.next();			
			if(str.equals("push")) {
				int a= sc.nextInt();				
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





