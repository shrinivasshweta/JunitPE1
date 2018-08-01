package com.stackroute.demounit;
import  java.util.Scanner;

public class PalindromeEx {
	
	 public String func1(int z) {
		 int m, a = 0,x, sum = 0;
		 m = z;
	        while(z > 0){

	            x = z % 10;
	            a = a * 10 + x;
	            z = z / 10;
	            if(x%2 == 0){
	                  sum = sum + x;
	               }
	        }

	        if(a == m) {
	            if(sum > 25)
	                 return (m+" is palindrome and the sum of even numbers is greater than 25");
	            else
	            	return ( m+" is palindrome and the sum of even numbers is less than 25");
	        }

	        else
	            return (m+" is not a palindrome ");
	    }
	 
		 
	 
	   
		public static void main(String args[])

	    { int n;
	        
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter number:");
	        n = s.nextInt();
	        
	        PalindromeEx e = new PalindromeEx();
	        System.out.print(e.func1(n));
	        s.close();
	        
	       
	}
		}
