import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Lütfen bir ürün fiyatı girin: ");
		double moneyValue = input.nextDouble();
		double KDVValue = moneyValue <= 1000 && moneyValue > 0? 18 : 8;
		if (moneyValue <= 0) {
			System.out.print("Lütfen geçerli bir fiyat girin: ");
			moneyValue = input.nextDouble();
		}
		double totalWithKDV = moneyValue * (1 + KDVValue/100);
		double justKDV = totalWithKDV % moneyValue;
		
		
		
		System.out.println("KDV hariç fiyat: " + moneyValue + "₺");
		System.out.println("KDV dahil fiyat: " + totalWithKDV + "₺");
		System.out.println("KDV oranı: " + KDVValue/100);
		System.out.println("KDV tutarı: " + justKDV + "₺");
		
		
		
	
	}

}
