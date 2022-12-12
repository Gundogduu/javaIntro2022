Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
- Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
- Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
- Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

### İpucu
```
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL
````
### Sonuç
````
Mesafeyi km türünden girin: 1500
Yaşınızı girin: 20
Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): 1
Toplam Tutar: 135.0₺
````
```
Mesafeyi km türünden girin: 1500
Yaşınızı girin: 20
Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): 2
Toplam Tutar: 216.0₺
````
````
Mesafeyi km türünden girin: 1500
Yaşınızı girin: 11
Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): 1
Toplam Tutar: 75.0₺
````
````
Mesafeyi km türünden girin: 1500
Yaşınızı girin: 11
Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): 2
Toplam Tutar: 120.0₺
````
```
Mesafeyi km türünden girin: 1500
Yaşınızı girin: 66
Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): 1
Toplam Tutar: 105.0₺
````
````
Mesafeyi km türünden girin: 1500
Yaşınızı girin: 66
Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): 2
Toplam Tutar: 168.0₺
````
````
Mesafeyi km türünden girin: 1500
Yaşınızı girin: 35
Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): 1
Toplam Tutar: 150.0₺
````
````
Mesafeyi km türünden girin: 1500
Yaşınızı girin: 35
Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): 2
Toplam Tutar: 300.0₺
````
````
Mesafeyi km türünden girin: -500
Yaşınızı girin: 1
Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): 2
Hatalı veri girdiniz!
````
````
Mesafeyi km türünden girin: 1500
Yaşınızı girin: 22
Yolculuk Tipini girin (1 => Tek Yön, 2 => Gidiş-Dönüş): 77
Hatalı veri girdiniz!
````




