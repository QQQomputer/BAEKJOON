package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2751_ver_merge {
//수 정렬하기 2, mergesort
	
	static int [] arr = null;
	static int [] sorted = null;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		sorted = new int[n];
		for(int i =0; i<arr.length;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		divide(0, arr.length-1);
		
		for(int i =0; i<arr.length;i++) {
			sb.append(arr[i]+"\n");
		}		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
	public static void divide(int start, int end) {
		if(start<end) {
			int mid = (start+end)/2;
			divide(start, mid);
			divide(mid+1, end);			
			merge(start, mid, end);
		}	
	}
	public static void merge(int start, int mid, int end) {
		int left = start;
		int right = mid+1;
		int idx = start;
		
		while(left <= mid && right <= end) {
			if(arr[left]<arr[right]) {
				sorted[idx]=arr[left];
				left++;
			}else {
				sorted[idx]=arr[right];
				right++;
			}
			idx++;
		}
		while(left<=mid) {
			sorted[idx]=arr[left];
			left++;
			idx++;
		}
		while(right<=end) {
			sorted[idx]=arr[right];
			right++;
			idx++;
		}
		for(int i=start;i<=end;i++) {
			arr[i]=sorted[i];
		}				
	}
}
