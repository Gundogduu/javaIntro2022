import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		double kg, m, total;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lüften boyunuzu(metre cinsinden) girin: ");
		m = scanner.nextDouble();
		System.out.print("Lütfen kilonuzu girin: ");
		kg = scanner.nextDouble();
		
		total = kg / (m * m);
		System.out.println("Vücut Kitle İndeksiniz: " + total);
	}
}
