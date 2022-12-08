import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double math, physics, chemical, turkish, music, average;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu girin: ");
		math = scanner.nextDouble();
		System.out.print("Fizik notunuzu girin: ");
		physics = scanner.nextDouble();
		System.out.print("Kimya notunuzu girin: ");
		chemical = scanner.nextDouble();
		System.out.print("Türkçe notunuzu girin: ");
		turkish = scanner.nextDouble();
		System.out.print("Müzik notunuzu girin: ");
		music = scanner.nextDouble();
		
		if(math>=0 && math<=100 && physics>=0 && physics<=100 && chemical>=0 && chemical<=100 && turkish>=0 && turkish<=100 && music>=0 && music<=100) {
			average = (math + physics + chemical + turkish + music) / 5;
			System.out.println("Ortalamanız: " + average);
		}else {
			System.out.println("Geçersiz not! Lütfen 0 ile 100 arasında not girin");
		}

	}
}
