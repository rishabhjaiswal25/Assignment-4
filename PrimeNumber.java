package assignment_4;

import java.util.Scanner;

public class PrimeNumber {

	static boolean isPrime(int n) {
		if (n <= 1) return false;
		
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void printPrimes(int a, int b) {
		if (a >= b) {
			System.out.println("Provide valid input");
		} else {
			for (int i = a; i <= b; i++) {
				if (isPrime(i)) {
					System.out.println(i);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		printPrimes(a, b);

	}

}
