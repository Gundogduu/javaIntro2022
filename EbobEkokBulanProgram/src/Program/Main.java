package Program;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("n1 sayısını girin: ");
		int n1 = scanner.nextInt();
		System.out.print("n2 sayısını girin: ");
		int n2 = scanner.nextInt();
		
		int i = n1;
		 while( i >= 1) {
			i--;
			if( n1 % i == 0 && n2 % i == 0) {
				System.out.println("EBOB: " + i);
				break;
			}
		}
		
		int k = 1;
		while(k <= (n1 * n2)) {
			k++;
			if( k % n1 == 0 && k % n2 == 0) {
				System.out.println("EKOK: " + k);
				break;
			}	
		}	
	}
}
