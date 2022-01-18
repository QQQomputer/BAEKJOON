package com.bronze.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2775 {
//부녀회장이 될테야
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int loop = Integer.parseInt(br.readLine());
		int k,n;

		for(int z =0;z<loop;z++){

			k=Integer.parseInt(br.readLine());
			n=Integer.parseInt(br.readLine());
			int [] pre = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
			int [] ho = new int[n];
			ho[0]=1;
			if(n==1) {
				bw.write(1+"\n");
			}else {
				for(int i=0;i<k;i++) {
					
					for(int j=1;j<n;j++) {
						ho[j] = ho[j-1]+pre[j];
						pre[j]=ho[j];
					}
				}
				bw.write(ho[n-1]+"\n");
			}						
			
		}
		bw.flush();
		bw.close();		
	}
}
