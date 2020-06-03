package com.test.numbers;

public class HCM {
	
	//a*b=gcd(a,b)*hcm(a,b) 
	//hcm(a,b)=a*b/ gcd(a,b);
	private static int findHCM(int a,int b) {
			
		return (a*b)/GCD.findGCD(a, b);
	}

	public static void main(String[] args) {
      
		int a=36;
		int b=24;
		System.out.println("HCM of two numbers "+a+","+b+" is"+findHCM(a, b));
		
	}

}
