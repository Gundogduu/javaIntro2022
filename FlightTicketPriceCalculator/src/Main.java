import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double km = 0.10, distance, standardPrice, ageDiscount, 
				discountedPrice, roundTripTicketDiscount, roundTripTicketDiscountRate = 0.20, totalPrice;
		int age, tripType;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden girin: ");
		distance = scanner.nextDouble();
		System.out.print("Yaşınızı girin: ");
		age = scanner.nextInt();
		System.out.print("Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
		tripType = scanner.nextInt();
		
		if(distance >=1 && age >=1 && tripType >=1 && tripType <=2) {
			standardPrice = distance * km;
			if(age <= 12) {
				ageDiscount = standardPrice * 0.50;
				discountedPrice = standardPrice - ageDiscount;
				if(tripType == 1) {
					System.out.println("Toplam Tutar: " + discountedPrice + "₺");
				}else {
					roundTripTicketDiscount = discountedPrice * roundTripTicketDiscountRate;
					totalPrice = (discountedPrice-roundTripTicketDiscount) * 2;
					System.out.println("Toplam Tutar: " + totalPrice + "₺");
				}
			}else if(age >= 12 && age <= 24) {
				ageDiscount = standardPrice * 0.10;
				discountedPrice = standardPrice - ageDiscount;
				if(tripType == 1) {
					System.out.println("Toplam Tutar: " + discountedPrice + "₺");
				}else {
					roundTripTicketDiscount = discountedPrice * roundTripTicketDiscountRate;
					totalPrice = (discountedPrice-roundTripTicketDiscount) * 2;
					System.out.println("Toplam Tutar: " + totalPrice + "₺");
				}
				
			}else if(age >= 65) {
				ageDiscount = standardPrice * 0.30;
				discountedPrice = standardPrice - ageDiscount;
				if(tripType == 1) {
					System.out.println("Toplam Tutar: " + discountedPrice + "₺");
				}else {
					roundTripTicketDiscount = discountedPrice * roundTripTicketDiscountRate;
					totalPrice = (discountedPrice-roundTripTicketDiscount) * 2;
					System.out.println("Toplam Tutar: " + totalPrice + "₺");
				}				
			}else if(tripType == 1) {
				System.out.println("Toplam Tutar: " + standardPrice + "₺");
			}else {
				System.out.println("Toplam Tutar: " + (standardPrice * 2) + "₺");
			}
		}else {
			System.out.println("Hatalı veri girdiniz!");
		}
		
		
		
		
		
		
	}
}
