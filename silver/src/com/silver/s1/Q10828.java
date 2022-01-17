package com.silver.s1;

import java.util.Scanner;

public class Q10828 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); // ����
		
		int input = sc.nextInt()+1;
		int [] room = new int[input];
		int idx =0;

		for(int i=0;i<room.length;i++) {
			String str = sc.nextLine().trim();
		

			if(str.equals("pop")) {//=================================
				
				if(idx==0) {
					System.out.println("-1");
				}else {
					idx--;
					System.out.println(room[idx]);					
				}
				continue;
			}else if(str.equals("top")) {//=================================
				if(room[0]==0) {
					System.out.println("-1");
				}else {
					System.out.println(room[idx-1]);
				}
				continue;
				
			}else if(str.equals("size")) {//=================================
				System.out.println(idx);
			}else if(str.equals("empty")) {//=================================
				if(idx==0) {
					System.out.println("1");
				}else {
					System.out.println("0");
				}
				continue;
			}else if(str.length()>=6) {//=================================
				int a= Integer.parseInt(str.substring(5));				
				room[idx]=a;
				idx++;
				continue;
			}			
		}		
	}	
}





