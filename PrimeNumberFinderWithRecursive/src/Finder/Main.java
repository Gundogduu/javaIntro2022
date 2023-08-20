package Finder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = scanner.nextInt();
		
		if(isPrime(number)) {
			System.out.println(number + " is a prime number");
		}else {
			System.out.println(number + " is not a prime number");
		}
		

		
	}
	
	static boolean isPrime(int number) {
		return isPrimeHelper(number, 2);
	}
	
	static boolean isPrimeHelper(int number, int divider) {
		if(number <= 2) {
			return number == 2;
		}if(number % divider == 0) {
			return false;
		}if(divider * divider > number){
			return true;
		}
		return isPrimeHelper(number, divider + 1);
	}
}
