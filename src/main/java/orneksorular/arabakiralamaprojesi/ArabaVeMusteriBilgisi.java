package orneksorular.arabakiralamaprojesi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArabaVeMusteriBilgisi {
    /*
***********  Araba Kiralama Projesi TASK   ***********
    Bir araç kiralama projesi hazırlayınız.        Arac Talebi adında bir POJO class oluşturunuz.
     -	alınacaksehir, alınacakgun, alıssaati, teslimGunu, teslimSaati (kiralama ile ilgili bilgiler)
     -	marka, model, yakitTipi, vites ve gunlukUcret (araç ile ilgili bilgiler).
    -	Kiralama ile ilgili variable’ları içeren parametreli bir constructor oluşturun.
    -	Araç ile ilgili variable’ları içeren parametreli bir constructor oluşturun.
    -	Tum variable’lar için Getter ve Setter method’ları oluşturun (Encapsulation).
    MusteriveAracBilgileri adında method’ları içeren bir class oluşturunuz.
    -	aracTalep() adında bir method oluşturunuz.        Bu method’da alinacak sehir, teslim edilecek sehir,
      alinacak gun ve teslim edilecek gun ve teslim saati bilgilerini aliniz.        Odenecek toplam gun sayisini yazdırın.
        Dikkat: Teslim gunu, alis gününden daha once olamaz.
    -	arabalar() create ederek, tüm araç modellerini bir list’e atınız.
             (parametre olarak araç ile ilgili bilgileri alan <marka, model, yakıt tipi, vites, gunlukUcret> objeleri list’e atınız.)
             Bu list’i göstererek bir aracı kiralamasını sağlayın.
    -	getAraba() metodu ile seçmiş olduğu aracı gösterin. Odeyeceği toplam miktari yazdirin.
      Onaylar ise, müşteri bilgilerini almak için devam edin.
    -	musteriBilgileri() metodu ile müşteri ile ilgili bilgileri aliniz. AdSoyad, ID, yaş ve telefon.
    -	OdemeBilgieri() metodu ile odeme bilgilerini alacaginiz bir method create ediniz.
    *  Kart numarası uzunluğu 12 olmalıdır, kontrol ediniz.
 */
    public static AracIsteme aracIsteme() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen araci alacaginiz sehri giriniz");
        String aracAlimYeri = scanner.nextLine();
        System.out.println("Lutfen araci teslim sehri giriniz");
        String teslimYeri = scanner.nextLine();

        boolean isValid = false;
        LocalDate alisTarihi;
        LocalTime alisSaati;
        LocalDate teslimGunu;
        LocalTime teslimSaati;
        do {
            isValid = false;
            System.out.println("Araci teslim almak istediginiz tarihi belirtiniz:\n" +
                    "Tarih formatini gun:ay:yil seklinde giriniz");
            alisTarihi = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd:MM:yyyy"));
            System.out.println("Lutfen araci alim saatini giriniz");
            alisSaati = LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("HH:mm"));


            System.out.println("Lutfen araci teslim gununu giriniz");
            teslimGunu = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("dd:MM:yyyy"));
            System.out.println("Lutfen araci teslim saatini giriniz");
            teslimSaati = LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("HH:mm"));

            long teslimGunuSinama = ChronoUnit.DAYS.between(alisTarihi, teslimGunu);

            if (teslimGunuSinama < 0) {
                System.out.println("Teslim gunu alis gununden once olamaz");
                isValid = true;
            } else if (teslimGunuSinama == 0) {
                System.out.println("Ayni gun icerisinde alinip teslim edilen araclar icin bir gunluk ucret alinir!");
            }
        } while (isValid);
        return new AracIsteme(alisTarihi, alisSaati, teslimGunu, teslimSaati);

    }

    static List<Arac> aracListesi = new ArrayList<>();
    /*arabalar() create ederek, tüm araç modellerini bir list’e atınız.
    (parametre olarak araç ile ilgili bilgileri alan <marka, model, yakıt tipi, vites, gunlukUcret> objeleri list’e atınız.)
    */
    public static void aracOlustur() {

        Arac tip1 = new Arac("Toyota", "Corolla", "Benzin", "Otomatik", 500);
        Arac tip2 = new Arac("Opel", "Astra", "Benzin", "Manuel", 400);
        Arac tip3 = new Arac("Mercedes", "S500", "Dizel", "Otomatik", 950);
        Arac tip4 = new Arac("Bmw", "i5", "Dizel", "Manuel", 750);
        Arac tip5 = new Arac("Audi", "Q5", "Dizel", "Otomatik", 600);

        aracListesi.add(tip1);
        aracListesi.add(tip2);
        aracListesi.add(tip3);
        aracListesi.add(tip4);
        aracListesi.add(tip5);
    }

    public static void getAraba() { //getAraba() metodu ile seçmiş olduğu aracı gösterin. Odeyeceği toplam miktari yazdirin.
        System.out.println();
        System.out.println("**********  ONLINE ARAÇ KİRALAMA SİTEMİZE HOŞGELDİNİZ  **********");
        System.out.println();
        System.out.println("************************* ARAC LISTEMIZ *************************");
        System.out.println();
//        System.out.print("Marka", "Model", "Yakit Tipi", "Vites Tipi", "Gunluk Ucret");
//        System.out.print("_____", "_____", "__________", "__________", "____________");

        for (Arac w : aracListesi) {

            System.out.printf(
                    w.getMarka(), w.getModel(), w.getYakitTipi(), w.getVites(), w.getGunlukUcret());
        }
    }
    public static void musteriBilgileri(){  //musteriBilgileri() metodu ile müşteri ile ilgili bilgileri aliniz. AdSoyad, ID, yaş ve telefon.

        Scanner imput = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = imput.nextLine();

        System.out.println("Lutfen kimlik numaranizi giriniz");
        String id = imput.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        String yas= imput.nextLine();

        System.out.println("Lutfen telefon numaranizi giriniz");
        String telefonNumarasi = imput.nextLine();

        System.out.println("Isim = "+ isim+ "Kimlik Numarasi" + id + "Yas = " + yas + "telefonNumarasi   = " + telefonNumarasi  );
    }

    public static void OdemeBilgieri(){
        //metodu ile odeme bilgilerini alacaginiz bir method create ediniz.
            //*  Kart numarası uzunluğu 12 olmalıdır, kontrol ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen odeme bilgilerini diriniz");

        System.out.println("Lutfen adinizi giriniz");
        String mustariAdi = input.nextLine();

        do {
            System.out.println("Lutfen Kredi Karti numaranizi giriniz");
            String kimNum = input.nextLine();
            if (kimNum.length()==12){
                break;
            }else {
                System.out.println("Hatali giris yaptiniz");
            }

        }while (true);
        System.out.println("cv no giriniz");
        String cvNo = input.nextLine();

        System.out.println("Son kullanma tarihini giriniz");
        String sonKulTar = input.nextLine();

        System.out.println("Odeme basari ile gergeklesti");
    }
}
