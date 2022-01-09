package com.gold.s1;

import java.util.Scanner;

public class Q15824 {
//너 봄에는 캡사이신이 맛있단다
	public void mal() {
		System.out.println("hi");
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final long mod = 1000000007;
		int s = sc.nextInt();
		
		long [] scoville = new long[s];
		long [] result=null;
		for(int i=0; i<scoville.length;i++) {
			
			scoville[i] =0;
			scoville[i] =sc.nextInt();
		}		
		
		int a=0;
		long pow = 1;
//		for(int i=0; i<32;i++) {
//			pow = (pow*=2)%mod;
//		}	

		long min =294967268;
		long max =-1;
		long pain=0;
//		System.out.println(scoville[0]);
//		System.out.println(scoville[1]);
//		System.out.println(scoville[2]);
		
		
		for(int i=0; i<scoville.length; i++){
		    for(int j=i+1; j<scoville.length; j++){
		        for(int k=j+1; k<scoville.length; k++) {
		            // 중복 배제		        			        	
		        	long [] cur = {scoville[i], scoville[j], scoville[k]};

		    		for(int m=0;i<cur.length;i++) {
		    			min =294967268;
		    			max =-1;
		    			cur[m]= cur[m]%mod;
		    			if(cur[m]>max) {
		    	    		max=cur[m];
		    	    	}
		    	    	if(cur[m]<min){
		    	    		min=cur[m];
		    	    	}		    	    	
		    		}
		    		pain = pain%mod+max-min;
		        }
		    }
		}
		System.out.println(pain%mod);
		


		
		

	}

}
