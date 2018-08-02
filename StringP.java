package com.stackroute.demounit;
public class StringP 
{
	public String reverse(String a)
	{		
		String str="";
		char c[]=a.toCharArray();
			for(int i=c.length-1;i>=0;i--) 
			{
				str=str+c[i];
			}
		return str;
	}
}