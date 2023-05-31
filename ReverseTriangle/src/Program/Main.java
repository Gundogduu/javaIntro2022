package Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter line number: ");
		int line = scanner.nextInt();
		
		for(int i = 1; i <= line; i++) {
			for(int k = line-1; k>(line-i); k--) {
				System.out.print(" ");
			}
			for(int j = line*2; j>(2*i-1); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
