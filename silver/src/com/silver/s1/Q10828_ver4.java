package com.silver.s1;

import java.util.Scanner;

public class Q10828_ver4 {

	public static void main(String[] args){

      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      int [] room = new int[input];
      int size = 0;
        StringBuilder sb = new StringBuilder();
      
      for(int i=0;i<room.length;i++) {
         String str = sc.next();         
         if(str.equals("push")) {
            int a= sc.nextInt();            
            room[size]=a;
            size++;
         }else if(str.equals("pop")) {
            if(size==0) {
                    sb.append("-1\n");
               //System.out.println("-1");
            }else {
                    sb.append(room[size-1]).append("\n");
               //System.out.println(room[size-1]);
               size--;
            }
         }else if(str.equals("top")) {
            if(size==0) {
                    sb.append("-1\n");
               //System.out.println("-1");
            }else {
                    sb.append(room[size-1]).append("\n");
               //System.out.println(room[size-1]);
            }
         }else if(str.equals("size")) {
                sb.append(size).append("\n");
            //System.out.println(size);
         }else if(str.equals("empty")) {
            if(size==0) {
                    sb.append("1\n");
               //System.out.println("1");
            }else {
                    sb.append("0\n");
               //System.out.println("0");
            }
         }         
      }
        System.out.println(sb);
   }   
}




