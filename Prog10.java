package com.stackroute.demounit;

public class Prog10 
{
	public String method(String st) 
	{
		String s=st;
		int n=3;
			for(int i=0;i<n;i++)
			{
				for(int j=st.length()-n;j<st.length();j++)
				{
					s=s+(st.charAt(j));
				}
			}
		return s;
	
	}			
	
}
