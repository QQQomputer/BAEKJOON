package com.bronze.s1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q10951_2 {
	
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNextLine()){
			String [] A = sc.nextLine().split(" ");
			int result = Integer.parseInt(A[0])+Integer.parseInt(A[1]);			
			System.out.println(result);
			
		}
		sc.nextLine();	
	}
}
