import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double math, physics, chemical, turkish, music, average, total = 0;
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Matematik notunuzu girin: ");
		math = scanner.nextDouble();
		if(math>=0 && math<=100) {
			total += math;
			number++;
		}
		System.out.print("Fizik notunuzu girin: ");
		physics = scanner.nextDouble();
		if(physics>=0 && physics<=100) {
			total += physics;
			number++;
		}
		System.out.print("Kimya notunuzu girin: ");
		chemical = scanner.nextDouble();
		if(chemical>=0 && chemical<=100) {
			total += chemical;
			number++;
		}
		System.out.print("Türkçe notunuzu girin: ");
		turkish = scanner.nextDouble();
		if(turkish>=0 && turkish<=100) {
			total += turkish;
			number++;
		}
		System.out.print("Müzik notunuzu girin: ");
		music = scanner.nextDouble();
		if(music>=0 && music<=100) {
			total += music;
			number++;
		}
		
		average = total / number;
		System.out.println("Ortalamanız: " + average);
		if(average>=55) {
			System.out.println("Tebrikler, sınıfı geçtiniz!");
		}else {
			System.out.println("Malesef kaldınız!");
			
		}		
	}
}
