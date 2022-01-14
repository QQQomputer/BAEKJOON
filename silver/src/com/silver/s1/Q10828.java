package com.silver.s1;

import java.util.Scanner;

public class Q10828 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); // ¼±¾ð
		
		int input = sc.nextInt();
		int [] room = new int[input];
		int idx =0;

		for(int i=0;i<room.length;i++) {
			String str = sc.nextLine().trim();
			

			if(str.substring(0, 3).equals("push")) {
				int a= Integer.parseInt(str.substring(5));				
				room[idx]=a;
				idx++;
			}else if(str.equals("pop")) {
				
				if(room[0]==0) {
					System.out.println("-1");
				}else {
					System.out.println(room[idx-1]);
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





