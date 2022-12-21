import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number, unit = 0, sum = 0, average = 0;
		
		System.out.print("Sayı girin: ");
		number = scanner.nextInt();
		
		for(int i = 0; i <= number; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
				sum += i;
				unit++;
			}		
		}
		average = sum / unit;
		System.out.println(unit + " unit");
		System.out.println(sum + " sum");
		System.out.println("Average: " + average);
		
	}
}
