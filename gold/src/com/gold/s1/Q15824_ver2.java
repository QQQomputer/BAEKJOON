package com.gold.s1;

import java.util.Scanner;

public class Q15824_ver2 {
//너 봄에는 캡사이신이 맛있단다

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final long mod = 1000000007;
		int s = sc.nextInt();
		
		int [] scoville = new int[s];
		int [] result=null;
		for(int i=0; i<scoville.length;i++) {
			
			scoville[i] =0;
			scoville[i] =sc.nextInt();
		}		

		int min =294967268;
		int max =-1;
		int pain=0;
//		System.out.println(scoville[0]);
//		System.out.println(scoville[1]);
//		System.out.println(scoville[2]);
				
		for(int i=0; i<scoville.length; i++){
		    for(int j=i+1; j<scoville.length; j++){
		        for(int k=j+1; k<scoville.length; k++) {
		            // 중복 배제		        			        	
		        	int [] cur = {scoville[i], scoville[j], scoville[k]};
		        	
		    		System.out.println(cur[i]);
		    		System.out.println(cur[j]);
		    		System.out.println(cur[k]);
		    		System.out.println(cur.length);
		    		for(int m=0;m<cur.length;m++) {

		    			if(cur[m]>max) {
		    				System.out.println(m+"max지정");
		    				max=cur[m];
		    	    	}
		    	    	if(cur[m]<min){
		    	    		System.out.println(m+"min지정");
		    	    		min=cur[m];
		    	    	}		    	    	
		    		}
		    		pain = pain+max-min;
		        }
		    }
		}
		System.out.println(pain%mod);
		


		
		

	}

}
