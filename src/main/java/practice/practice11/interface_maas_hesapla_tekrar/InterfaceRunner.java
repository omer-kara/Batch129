package practice.practice11.interface_maas_hesapla_tekrar;

public class InterfaceRunner {
            /*
    Net maaş hesaplayan bir kod yazınız.(Interface kullanınız)
    Maaş kriterleri: Çalışanın toplam çalışma yılına göre her yıl için brüt maaşı 100 dolar  artır.
    Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için brüt maaşı 10 dolar artır.
    10 yıl ve üstü çalışma yılı bulunan çalışanların brüt maaşlarından %30, diğerlerinden %20 vergi kesintisi yap.
     */
            public static void main(String[] args) {

                MaasHesapla maasHesapla = new MaasHesapla();
                System.out.println(maasHesapla.netMass(10000, 11, 170));
            }
}
