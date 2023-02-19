package practice.practice11.interface_maas_hesapla;

public class InterfaceRunner {
    public static void main(String[] args) {
        /*
    Net maaş hesaplayan bir kod yazınız.(Interface kullanınız)
    Maaş kriterleri: Çalışanın toplam çalışma yılına göre her yıl için brüt maaşı 100 dolar  artır.
    Çalışanın aylık çalışma saatine göre 160 saat üstü  her saat için brüt maaşı 10 dolar artır.
    10 yıl ve üstü çalışma yılı bulunan çalışanların brüt maaşlarından %30, diğerlerinden %20 vergi kesintisi yap.
     */

        MaasHesapla maasHesapla = new MaasHesapla();
        System.out.println("Net maas = " + maasHesapla.neetMaas(10000, 9, 170));
    }
}
