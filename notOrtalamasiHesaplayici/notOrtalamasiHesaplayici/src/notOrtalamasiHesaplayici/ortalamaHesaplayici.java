package notOrtalamasiHesaplayici;

import java.util.Scanner;

public class ortalamaHesaplayici {
	public static void main(String[] args){
		
		//Kullanıcıdan isteyeceğimiz inputları değişken olarak tanımlıyoruz...
		double mat, fizik, kimya, turkce, tarih, muzik;
		
		
		//İnputları kullanıcıdan alabilmemiz için Scanner sınıfını import anathar kelimesiyle projemize dahil ediyoruz...
		Scanner girdi = new Scanner(System.in);
		
		
		//Kullanıcıdan verileri istiyoruz ve değişkenlerimize atıyoruz...
		System.out.print("Lütfen Matematik notunuzu girin : ");
		mat = girdi.nextDouble();
		
		System.out.print("Lütfen Fizik notunuzu girin : ");
		fizik = girdi.nextDouble();
		
		System.out.print("Lütfen Kimya notunuzu girin : ");
		kimya = girdi.nextDouble();
		
		System.out.print("Lütfen Türkçe notunuzu girin : ");
		turkce = girdi.nextDouble();
		
		System.out.print("Lütfen Tarih notunuzu girin : ");
		tarih = girdi.nextDouble();
		
		System.out.print("Lütfen Müzik notunuzu girin : ");
		muzik = girdi.nextDouble();
		
		
		//Tüm inputları topluyoruz ve tümünün ortalamasını bulmak için kaç tane input varsa o adete bölüyoruz...
		Double ortalama = mat + fizik + kimya + turkce + tarih + muzik;
		ortalama /= 6;
		
		
		//Kullanıcıya cıktı olarak hem ortalamasını hem geçip kalma durumunu veriyoruz...
		String sonuc = ortalama >= 60 ? "sınıfı geçtin!" : "sınıfta kaldın!";
		System.out.println("Not ortalamanız: " + ortalama + " dolayısıyla, " + sonuc);
		
		
		
		
		
	}

}
