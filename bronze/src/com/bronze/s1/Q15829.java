package com.bronze.s1;

import java.util.Scanner;

public class Q15829 {
//Hashing
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		
        String str = sc.next();
        char ch = 'a';
        int [] asc = new int[z];
        for(int i=0;i<asc.length;i++) {       	
        	asc[i] = ch;
        	asc[i] = str.charAt(i);
        }
        int a = 0;
        for(int i=0;i<asc.length;i++) {
        	a+=(asc[i]-96)*(int)Math.pow(31, i);       	
        }		
        System.out.println(a);
	}
}
