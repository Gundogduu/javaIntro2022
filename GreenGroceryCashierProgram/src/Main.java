import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double pear = 2.14, apple = 3.67, tomato = 1.11, banana = 0.95, eggplant = 5, pearKg, appleKg, tomatoKg, bananaKg, eggplantKg, total;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Armut kaç kilo?: ");
		pearKg = scanner.nextDouble();
		System.out.print("Elma kaç kilo?: ");
		appleKg = scanner.nextDouble();
		System.out.print("Domates kaç kilo?: ");
		tomatoKg = scanner.nextDouble();
		System.out.print("Muz kaç kilo?: ");
		bananaKg = scanner.nextDouble();
		System.out.print("Patlıcan kaç kilo?: ");
		eggplantKg = scanner.nextDouble();
		
		total = (pear*pearKg) + (apple*appleKg) + (tomato*tomatoKg) + (banana*bananaKg) + (eggplant*eggplantKg);
		System.out.println("Toplam tutar: " + total + "₺");
	}
}
