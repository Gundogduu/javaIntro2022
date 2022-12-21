import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int number, total = 0;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Sayı girin: ");
			number = scanner.nextInt();
			if (number % 4 == 0) {
				total += number;
			}
			
		} while (number % 2 == 0);
		System.out.println("Çift ve 4'ün katı olan sayıların toplamı: " + total);
	}
}
