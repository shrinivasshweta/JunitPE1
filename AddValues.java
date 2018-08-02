package com.stackroute.demounit;

public class AddValues {
	
		public int calVal() {
			int sum=0;
			int[] num = new int[]{ 1,2,3,4,8}; 
			
			for (int i = 0; i < 5; i++) 
			{
			    
			    sum+=num[i];
			}
			return(sum);
			}
	}

