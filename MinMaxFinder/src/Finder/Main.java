package Finder;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç tane sayı gireceksiniz?: ");
		int border = scanner.nextInt();
		int number = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 1; i <= border; i++) {
			System.out.print(i + ". sayıyı girin: ");
			number = scanner.nextInt();
			if(number > 0) {
				if(number < min) {
					min = number;
				}
				if(number > max){
					max = number;
					}
			}else {
				System.out.println("Girdiğiniz sayı, Sayma sayısı olmak zorunda!");
				break;
			}
		
		}
		System.out.println("En büyük sayı: " + max);
		System.out.println("En küçük sayı: " + min);
	}

}
