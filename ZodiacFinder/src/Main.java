import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int month, day;
		String zodiac = "";
		boolean isError = false;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Doğduğunuz ay: ");
		month = scanner.nextInt();
		System.out.print("Doğduğunuz gün: ");
		day = scanner.nextInt();
		
		if(month >=1 && month <=12) {
			if(month == 1) {
				if(day >= 1 && day <= 31) {
					if(day < 22) {
						zodiac = "Oğlak";
					}else {
						zodiac = "Kova";
					}
				}else {
					isError = true;
				}
				
			}else if(month == 2) {
				if(day >= 1 && day <= 28) {
					if(day < 20) {
						zodiac = "Kova";
					}else {
						zodiac = "Balık";
					}
				}else {
					isError = true;
				}
				
			}else if(month == 3) {
				if(day >= 1 && day <= 31) {
					if(day < 21) {
						zodiac = "Balık";
					}else {
						zodiac = "Koç";
					}
				}else {
					isError = true;
				}
				
			}else if(month == 4) {
				if(day >= 1 && day <= 30) {
					if(day < 21) {
						zodiac = "Koç";
					}else {
						zodiac = "Boğa";
					}
				}else {
					isError = true;
				}
				
			}else if(month == 5) {
				if(day >= 1 && day <= 31) {
					if(day < 22) {
						zodiac = "Boğa";
					}else {
						zodiac = "İkizler";
					}
				}else {
					isError = true;
				}
				
			}else if(month == 6) {
				if(day >= 1 && day <= 30) {
					if(day < 23) {
						zodiac = "İkizler";
					}else {
						zodiac = "Yengeç";
					}
				}else {
					isError = true;
				}
				
			}else if(month == 7) {
				if(day >= 1 && day <= 31) {
					if(day < 23) {
						zodiac = "Yengeç";
					}else {
						zodiac = "Aslan";
					}
				}else {
					isError = true;
				}
				
			}else if(month == 8) {
				if(day >= 1 && day <= 31) {
					if(day < 23) {
						zodiac = "Aslan";
					}else {
						zodiac = "Başak";
					}
				}else {
					isError = true;
				}
				
			}
			else if(month == 9) {
				if(day >= 1 && day <= 30) {
					if(day < 23) {
						zodiac = "Başak";
					}else {
						zodiac = "Terazi";
					}
				}else {
					isError = true;
				}
				
			}else if(month == 10) {
				if(day >= 1 && day <= 31) {
					if(day < 23) {
						zodiac = "Terazi";
					}else {
						zodiac = "Akrep";
					}
				}else {
					isError = true;
				}
				
			}else if(month == 11) {
				if(day >= 1 && day <= 30) {
					if(day < 22) {
						zodiac = "Akrep";
					}else {
						zodiac = "Yay";
					}
				}else {
					isError = true;
				}
				
			}else if(month == 12) {
				if(day >= 1 && day <= 31) {
					if(day < 22) {
						zodiac = "Yay";
					}else {
						zodiac = "Oğlak";
					}
				}else {
					isError = true;
				}
				
			}
			if(isError) {
				System.out.println("Hatalı bilgi girdiniz, lütfen tekrar deneyin.");
			}else {
				System.out.println("Burcunuz: " + zodiac);
			}

		}else {
			System.out.println("Hatalı bilgi girdiniz, lütfen tekrar deneyin.");
		}
	
	}

}
