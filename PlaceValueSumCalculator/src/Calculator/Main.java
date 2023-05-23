package Calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scanner.nextInt();
		int tempNumber = number;
		int placeValue;
		int total = 0;
		while(tempNumber > 0) {
			placeValue = tempNumber % 10;
			total += placeValue;
			tempNumber = tempNumber / 10;
		}
		System.out.println("Total: " + total);
	}

}
