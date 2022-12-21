import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int year;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Yıl girin: ");
		year = scanner.nextInt();
		
		if(year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println(year + " bir artık yıl!");
				}else {
					System.out.println(year + " bir artık yıl değil!");
				}
			}else {
				System.out.println(year + " bir artık yıl!");
			}
		}else {
			System.out.println(year + " bir artık yıl değil!");
		}
		
	}

}
