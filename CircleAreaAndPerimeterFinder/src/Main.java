import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		double r, area, periMeter, pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen dairenin yarıçapını girin: ");
		r = scanner.nextDouble();
		
		//formul
		area = pi * r * r;
		periMeter = 2 * pi * r;
		
		System.out.println("Dairenin alanı: " + area + " ve çevresi: " + periMeter);
		
	}

}
