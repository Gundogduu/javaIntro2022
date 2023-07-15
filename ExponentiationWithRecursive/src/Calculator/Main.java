package Calculator;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter base number: ");
		int base = scanner.nextInt();
		System.out.print("Enter exponent number: ");
		int exponent = scanner.nextInt();
		System.out.println(exponentiation(base, exponent));
		
		
	}
	
	static int exponentiation(int base, int exponent) {
		if(exponent == 0) {
			return 1;
		}else{
			return base * exponentiation(base, exponent-1);
		}		
	}
}
