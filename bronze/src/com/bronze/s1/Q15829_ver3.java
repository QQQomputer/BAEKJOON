package com.bronze.s1;

import java.util.Scanner;

public class Q15829_ver3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long z = sc.nextInt();

    	String str = sc.next();
    	//String => 한글자씩 나누는 방법
    	//String[] array = str.split("");		
		
        char[] array = str.toCharArray();
    	
        long x=0;                
        for(long i=0;i<array.length;i++) {
        	x+=((long)array[(int) i]-96l)*(long)Math.pow(31l, (int)i);
        }
        System.out.println(x);
	}
}
