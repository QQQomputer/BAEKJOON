package com.bronze.s1;

import java.util.Scanner;

public class Q15829_ver2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();

    	String str = sc.next();
    	//String => 한글자씩 나누는 방법
    	//String[] array = str.split("");		
		
        char[] array = str.toCharArray();
    	
        int x=0;                
        for(int i=0;i<array.length;i++) {
        	x+=(array[i]-96)*(int)Math.pow(31, i);
        }
        System.out.println(x);
	}
}
