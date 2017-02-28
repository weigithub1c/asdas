package com.hand.HanSong;


public class HanSong{
	
	public static void main(String[] args){		      
		int i;	
		System.out.print("101-200区间的质数：");
		System.out.print("< ");
		for (int n = 101; n <= 200; n++) {			      
			for (i = 2; i < n; i++) {				        
				if (n % i == 0) {					   					
					break;			           
				}	  			
			}	            
			if (n == i) {
				System.out.print(n );						
				if(i!=199){				
					System.out.print(",");	
				}
			}	        
		}
		System.out.println(" >");
	}
}
