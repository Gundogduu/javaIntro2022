import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String userName, passWord;
		int reset;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen kullanıcı adınızı girin: ");
		userName = scanner.nextLine();
		System.out.print("Lütfen kullanıcı parolanızı girin: ");
		passWord = scanner.nextLine();
		
		if(userName.equals("patika") && passWord.equals("java123")) {
			System.out.println("Giriş Yaptınız!");
		}else {
			System.out.println("Bilgileriniz yanlış!");
			System.out.print("Şifrenizi sıfırlamak istiyor musunuz? Eğer istiyorsanız 1, istemiyorsanız 2 yazın: ");
			reset = scanner.nextInt();
			if(reset == 1) {
				System.out.print("Lütfen yeni şifre girin: ");
				scanner.nextLine();
				passWord = scanner.nextLine();
				if(passWord.equals("java123")) {
					System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz.");
				}else {
					System.out.println("Şifren başarıyla oluşturuldu");
				}
			}
		}
	}

}
