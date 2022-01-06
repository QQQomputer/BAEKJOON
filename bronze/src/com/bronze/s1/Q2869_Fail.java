package com.bronze.s1;

import java.util.Scanner;

public class Q2869_Fail {
//달팽이는 올라가고 싶다, 0.15 s
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int [] a = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		for(int i=0;i<a[2];i++) {
			if(a[0]+(a[0]-a[1])*i>=a[2]) {
				a[0]=i;
				i=a[2];
				break;
			}
		}
		System.out.println(a[0]+1);	
	}
}
