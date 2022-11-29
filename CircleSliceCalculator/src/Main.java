import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double a, r, areaOfTheCircleSlice, pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dairenin yarı çapını girin: ");
		r = scanner.nextDouble();
		System.out.print("Dairenin merkez açı ölçüsünü girin: ");
		a = scanner.nextDouble();
		
		//formul
		areaOfTheCircleSlice = (pi * (r * r) * a) / 360;
		System.out.println("Daire diliminin alanı: " + areaOfTheCircleSlice);
				
				
				
				
				
				
	}
}
