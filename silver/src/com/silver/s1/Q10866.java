package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Q10866 {
//덱
	static BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb= new StringBuilder();
	static String str="";
	static ArrayList<Integer> arr= new ArrayList<>();
	
//	public Q10866() {
//		br = new BufferedReader(new InputStreamReader(System.in));
//		bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		sb = new StringBuilder();
//		str ="";
//		arr = new ArrayList<>();
//	}
	
	
	public static void main(String[] args) throws Exception {
		
		int count = Integer.parseInt(br.readLine());
		for(int i=0;i<count;i++) {			
			menu();				
			bw.flush();
		}
		bw.close();
	}
	
	public static void menu() throws Exception {
		str = br.readLine();
		if(str.substring(0, 4).equals("push")) {
			if(str.substring(5,9).equals("back")){
				push_back(Integer.parseInt(str.substring(10)));
			}else {
				push_front(Integer.parseInt(str.substring(11)));
			}				
		}else if(str.substring(0, 3).equals("pop")) {
			if(str.substring(4,8).equals("back")){
				pop_back();
			}else {
				pop_front();
			}
		}else if(str.equals("size")) {
			size();
		}else if(str.equals("empty")) {
			empty();
		}else if(str.equals("front")) {
			front();
		}else if(str.equals("back")) {
			back();
		}
	}
	
	
	public static void push_front(int a) {
		arr.add(0, a);
	}
	public static void push_back(int a) {
		arr.add(a);	
	}
	public static void pop_back() throws IOException {
		if(arr.isEmpty()) {
			bw.write(-1+"\n");
		}else {
			bw.write(arr.get(arr.size()-1)+"\n");
			arr.remove(arr.size()-1);			
		}		
	}
	public static void pop_front() throws IOException {		
		if(arr.isEmpty()) {
			bw.write(-1+"\n");
		}else {
			bw.write(arr.get(0)+"\n");
			arr.remove(0);
		}
	}
	public static void size() throws IOException {
		bw.write(arr.size()+"\n");
	}
	public static void empty() throws IOException {
		if(arr.isEmpty()) {
			bw.write(1+"\n");
		}else {
			bw.write(0+"\n");
		}
	}
	public static void front() throws IOException {
		if(arr.isEmpty()) {
			bw.write(-1+"\n");
		}else {
			bw.write(arr.get(0)+"\n");
		}
	}
	public static void back() throws IOException {
		if(arr.isEmpty()) {
			bw.write(-1+"\n");
		}else {
			bw.write(arr.get(arr.size()-1)+"\n");			
		}	
	}	
}
