package Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Elmas yapmak için yıldız girin: ");
		String star = scanner.nextLine();
		
		
		
		int border = 5;
		for(int i=2; i<=border; i++) {
			for(int k=1; k<=(border-i); k++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for(int i=1; i<=border; i++) {
			for(int k=4; k>=(border-i); k--) {
				System.out.print(" ");
			}
			for(int j=7; j>=(2*i-1); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
