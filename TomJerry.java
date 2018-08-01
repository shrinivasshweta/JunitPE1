package com.stackroute.demounit;
import  java.util.Scanner;

public class TomJerry {
			    public String func2(int n) {
		    	 if(n<30 && n>20) {
		        	 if(n%2 !=0)
		        		 return ("Tom");
		        	 else
		        		 return ("Jerry");
		        	
		        }
		        else
		        	return("Invalid input");
		    }

			public static void main(String args[])

		    {
		        int n;
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter number:");
		        n = s.nextInt();
		        
		        TomJerry t = new TomJerry();
		        System.out.print(t.func2(n));
		        s.close();
		        
		       
		    }
	}


