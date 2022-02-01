package com.silver.s1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q9020_ver2 {
//골드바흐의 추측, partition
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
		int n = Integer.parseInt(br.readLine());
		int gb = 0;		
		boolean [] prime =new boolean[10001];
		StringBuilder sb = new StringBuilder();
		int b1;
		int b2;
		prime[0]=true;
		prime[1]=true;
		for(int i=2;i<prime.length;i++) {			
			if(prime[i]) {
				continue;
			}else {
				for(int j =i*i;j<prime.length;j+=i) {
					prime[j]=true;
				}
			}			
		}
		for(int i=0;i<n;i++) {
			gb = Integer.parseInt(br.readLine());			
			b1 = gb/2;
			b2=b1;
			while(true) {
				if(prime[b1] || prime[b2]) {
					b1--;
					b2++;
				}else {
					break;
				}
			}
			sb.append(b1+" "+b2+"\n");	
		}		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
