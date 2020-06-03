package com.test;

public class PrimeNumber {

	private static void printPrimeNumbers(int n) {
		int count = 0;
		for (int i = 2; i <= n; i++) {
			count = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.print(" " + i);
			}

		}
	}
	
	private static boolean isPrimeNumber(int n) {
		int count = 0;
		boolean isPrime = false;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println("Its a Prime Number " + n);
			isPrime = true;
		} else {
			System.out.println("Its not a Prime Number " + n);
		}

		return isPrime;
	}
	
	public static void main(String[] args) {
	
		 printPrimeNumbers(100);
		 System.out.println();
		 isPrimeNumber(4);

	}

}
