package com.test.numbers;

public class GCD {

	public static int findGCD(int a, int b) {

		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}

		return findGCD(b, a % b);
	}

	private static int findGCD2(int a, int b) {

		if(b==0) {
			return a;
		}

		return findGCD2(b, a-b);
	}

	public static void main(String[] args) {

		int a = 36;
		int b = 24;
		System.out.println("GCD of two numbers" + a + ", " + b + " is " + findGCD2(a, b));
	}

}
