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
		
		int [] prime =null;
		int idx=0;
		int a1=0;
		int a2=0;
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<n;i++) {	
			gb=Integer.parseInt(br.readLine());	
			prime =new int[gb];					
			prime[0]=2;
			idx=1;
			for(int k =3;k<prime.length;k++) {
				for(int j =2;j<k;j++) {				
					if(k%j==0) {
						break;
					}
					if(j==k-1) {
						prime[idx]=k;
						idx++;
					}					
				}			
			}
			a1=0;
			a2=idx-1;
			for(int k=0;k<idx-1;k++) {
				for(int j=k;j<idx-1;j++) {
					if(gb==prime[k]+prime[j]) {
						if(prime[a2]-prime[a1]>prime[j]-prime[k]) {
							a1=k;
							a2=j;
						}
					}
				}
			}
			sb.append(prime[a1]+" "+prime[a2]+"\n");			
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
