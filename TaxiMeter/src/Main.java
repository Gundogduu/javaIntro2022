import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int km;
		double perKm = 2.20, minPrice = 20, total = 10;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen km cinsinden mesafe girin: ");
		km = scanner.nextInt();
		total += km * perKm;
		total = (total <= minPrice)? minPrice : total;
		System.out.println("Toplam Tutar: " + total);
		
		
		
		 
	}
}
