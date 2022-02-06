package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2751_ver_quick {
//수 정렬하기 2, Quick sort
	static int [] arr=null;
	static int [] sorted=null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		sorted = new int[n];
		for(int i =0; i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		quick(0, arr.length-1);
		
		for(int i =0; i<arr.length;i++) {
			sb.append(arr[i]+"\n");
		}		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
								//0, 4
	public static void quick(int start, int end) {
		int left = start;
		int right =start;
		int k =end-start+1+left;
		int cur=0;
			
		for(int i = start; i<end;i++) {
			if(arr[end]>arr[right]) {
				sorted[right]=arr[right];
				left++;
				right++;
				
			}else {
				cur=left;
				left=right;
				right=cur;
				if(left<right) {
					sorted[left]=arr[right];//(end-start+left)%(end-start+1)
				}else {
					sorted[end]=arr[right];//(end-start+left)%(end-start+1)
				}
				
				//left++;
				right++;
			}
		}
		if(left<right) {
			sorted[left]=arr[end];
		}else {
			sorted[left+1]=arr[end];
		}
		
		arr=sorted;
		if(left>start)quick(start,left-1);
		if(left<end)quick(left+1,end);	
	}

}
