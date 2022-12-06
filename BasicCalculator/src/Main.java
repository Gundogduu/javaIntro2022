
import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Main {
	public static void main(String[] args) {
		int a, b, select;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("İlk sayıyı girin: ");
		a = scanner.nextInt();
		System.out.print("İkinci sayıyı girin: ");
		b = scanner.nextInt();
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.print("İşlemi seçin: ");
		select = scanner.nextInt();
		
		switch(select) {
			case 1 : {
				System.out.println("Toplama: " + (a+b));
				break;
			}case 2 : {
				System.out.println("Çıkarma: " + (a-b));
				break;
			}case 3 : {
				System.out.println("Çarpma: " + (a*b));
				break;
			}case 4 : {
				if(a!=0 && b!=0) {
					System.out.println("Bölme: " + (a/b));
				}else {
					System.out.println("Bir sayı 0'a bölünemez!");
				}
				break;
			}default : {
				System.out.println("Hatalı işlem yaptınız!");
			}
		}
		
		
		
	}

}
