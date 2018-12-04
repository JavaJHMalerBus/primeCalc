package de.heuschen.j.calc.prime;

public class PrimeCalculator {

	public static void main(String[] args) {
		System.out.println("PrimeCalculator by J. Heuschen");
		calcPrimes();
	}

	public static void calcPrimes() {
		for (int x = 0; x < Integer.MAX_VALUE; x++) {
			if (isPrime(x)) {
				System.out.println("IIIIIIIIIIIIII\t" + x);
			} else {
				System.out.println("______________");
			}
		}
	}

	public static boolean isPrime(int x) {
		if(x == 0 || x == 1)
			return false; //0 & 1 aren't prime numbers.
		for (int i = 2; 2 * i < x; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}

}
