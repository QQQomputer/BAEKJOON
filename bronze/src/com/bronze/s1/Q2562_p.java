package com.bronze.s1;

import java.util.Scanner;

public class Q2562_p {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int max=0;
		int i=0;//why
		for(i=0;i<9;i++) {
			int s = sc.nextInt();
			if(max<s) {
				max=s;
				i+=10;
			}
		}
		System.out.println(max);
		System.out.println(i-10);
	}

}		
		
		
		
/*
		Scanner sc = new Scanner(System.in);
		int [] a = new int[9];
		int max = 0;
		int idx=0;
		for(int i=0;i<9;i++) {
			a[i]=sc.nextInt();
			if(a[i]>max) {
				max=a[i];
				idx=i;
			}
		}
		System.out.println(max);
		System.out.println(idx+1);		
	}
}
*/		
		
		/*		




*/