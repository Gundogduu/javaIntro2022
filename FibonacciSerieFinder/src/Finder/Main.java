package Finder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many elements should the Fibonacci Series have?: ");
		int range = scanner.nextInt();
		int a = 0;
		int b = 1;
		int total = 0;
		
		for(int i = 0; i<=range; i++) {
			System.out.println(a + " + " + b + " = " + (total = a + b));
			a = b;
			b = total;
		}
	}
}
