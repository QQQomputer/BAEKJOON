package com.bronze.s1;

import java.util.Scanner;

public class Q2750 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int [] box = new int[s];
		
		for(int i=0;i<box.length;i++) {
			box[i]=0;
			box[i]=sc.nextInt();
		}
		for(int i=0;i<box.length;i++) {
			for(int j=0;j<box.length-1;j++) {				
				if(box[j]>box[j+1]) {
					int cur = box[j];
					box[j]=box[j+1];
					box[j+1]=cur;
				}				
			}			
		}		 
		for(int i=0;i<box.length;i++) {
			System.out.println(box[i]);
		}		
	}
}
