package Program;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		int number = scanner.nextInt();
		pattern(number);
	}
	
	static void pattern(int number) {
		int newNumber = number;
		patternHelperMinus(number, newNumber);
	}
	
	
	static void patternHelperMinus(int number,int newNumber) {
		int lastNumber = newNumber;
		if(newNumber > -5) {
			System.out.print(newNumber + " ");
			patternHelperMinus(number, newNumber - 5);
			patternHelperPlus(number, lastNumber + 5);
		}
	}
	
	static void patternHelperPlus(int number, int lastNumber) {
		if(lastNumber <= number) {
			System.out.print(lastNumber + " ");
		}
	}
}
