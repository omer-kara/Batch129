//package hastane;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class Hastane extends VeriBankasi {
//
//    public static void menuGoster() {
//        System.out.println("\n***QA TEAM-1 TIP MERKEZI ANA MENÜ***\n\n"
//                +"1-Hasta Arama Konsolu\n"
//                +"2-Hastalık Bilgisine Göre Doktor Arama Konsolu\n"
//                +"3-Uzmanlık Alanına Göre Doktor Arama Konsolu\n"
//                +"4-Randevu alma konsolu\n"
//                +"0-Cikis\n"
//                + "Yapmak istediginiz islemi seciniz\n");
//    }
//
//    public  static void start() {
//
//        slowPrint("\nTIP MERKEZİMİZE HOŞ GELDİNİZ", 100);
//        String secim;
//
//        do {
//            menuGoster();
//            Scanner scan = new Scanner(
//                    System.in
//            );
//            secim = scan.nextLine();
//            switch (secim) {
//                case "1":
//                    Hastane.hastaBulMethod() ;
//                    break;
//                case "2":
//                    Hastane.DoktorUnvan() ;
//                    break;
//                case "3":
//                    UnvandanDoktorArama.unvandanDoktorArama();
//                    break;
//                case "4":
//                    Randevu.randevuOlusturma();
//                    break;
//                case "0":
//                    System.out.println("Sistemden cikisiniz gerceklesti.Tekrar bekleriz.");
//                    break;
//                default:
//                    System.out.println("Hatali giris yaptiniz.Lutfen tekrar deneyiniz.");
//
//            }
//        } while (!secim.equals("0"));
//
//    }
//
//    public static void hastaBulMethod() {
//        Hastane hastane = new Hastane();
//        Durum hastaDurum = new Durum();
//        String hastalik = "";
//        Scanner input = new Scanner(System.in);
//        while (true) {
//            System.out.println("Hasta arama konsoluna hoşgeldiniz. Lütfen hastanın ID'sini giriniz.\nCikis icin 0'a basınız.");
//            int hastaId = 0;
//            try {
//                hastaId = input.nextInt();
//            } catch (Exception e) {
//                System.out.println("Kelime veya Harf girilemez. Hasta arama konsoluna yönlendirileceksiniz. ");
//                hastaBulMethod();
//            }
//            if (hastaId == 0) {
//                slowPrint("Ana menuye yönlendiriliyorsunuz",50);
//                break;
//            }
//            int hastaIdIndex = 0;
//            boolean hastaIdBul = false;
//            for (int i = 0; i < hastane.hastaIDleri.length; i++) {
//                if (hastane.hastaIDleri[i] == hastaId) {
//                    hastaIdBul = true;
//                    break;
//                }
//            }
//            if (!hastaIdBul) {
//                System.out.println("Hatali Id girdiniz. Hasta arama konsoluna yönlendirileceksiniz");
//                continue;
//            } else {
//                for (int i = 0; i < hastane.hastaIDleri.length; i++) {
//                    if (hastane.hastaIDleri[i] == hastaId) {
//                        hastaIdIndex = i;
//                        break;
//                    }
//                }
//                System.out.println("" +
//                        "\nHasta isim........: " + hastane.hastaIsimleri[hastaIdIndex]);
//                System.out.println("" +
//                        "\nHasta soyisim.....: " + hastane.hastaSoyIsimleri[hastaIdIndex]);
//                System.out.println("" +
//                        "\nHastalığı.........: " + hastane.durumlar[hastaIdIndex]);
//                hastalik = hastane.durumlar[hastaIdIndex];
//                System.out.println();
//            }
//
//            hastaDurum.setAciliyet(false);
//            {
//                boolean risk = hastalik.equalsIgnoreCase("Çocuk hastalıklari") ||
//                        hastalik.equalsIgnoreCase("Kalp hastaliklari");
//                if (risk) {
//                    System.out.println("Hastanın durumu acil!. Doktora bilgi veriniz.");
//                } else {
//                    System.out.println("Hastanın durumu acil değil.");
//                }
//            }
//            hastaDurum.setAktuelDurum(hastalik);
//            {
//                boolean risk = hastalik.equalsIgnoreCase("Çocuk hastalıklari") ||
//                        hastalik.equalsIgnoreCase("Kalp hastaliklari");
//                if (risk) {
//                    System.out.println("Aktuel durum = Hastayı yatarak tedavi ediniz.");
//                } else {
//                    System.out.println("Aktuel durum = Hastayı ayakta tedavi ediniz.");
//                }
//            }
//            System.out.println();
//
//            System.out.println("Sorumlu doktor bilgileri.........: ");
//
//            HastaliktanDoktorArama.hastaliktanDoktor(hastaId);
//
//        }
//    }
//
//    public static void DoktorUnvan() {
//
//        Scanner input = new Scanner(System.in);
//        VeriBankasi obj = new VeriBankasi();
//        int counter = 0;
//
//        do {
//            System.out.println(" Bu menude sikayetinize göre gidebileceginiz  Doktorlarin listesini göreceksiniz");
//
//            System.out.println("" +
//                    "\n Alerji icin................1'e " +
//                    "\n Bas agrisi icin............2'e " +
//                    "\n Tirnak batmasi icin........3'e" +
//                    "\n Cocuk hastaliklari icin....4'e" +
//                    "\n Diyabet icin...............5'e " +
//                    "\n Kalp hastaligi icin........6'ya " +
//                    "\n Ana menüye dönmek için ....7'a tıklayınız ");
//
//            int durum = 0;
//
//            String strKarar = input.next();
//
//            int kararDeger = String.valueOf(strKarar).replaceAll("[\\D]", "").length();
//
//            if (kararDeger < 1) {
//                System.out.println("Hatalı giriş yaptınız. Harf veya kelime ile giriş yapılamaz");
//                continue;
//            }
//
//            int karar = 0;
//
//            try {
//                karar = Integer.parseInt(strKarar);
//            } catch (NumberFormatException e) {
//                System.out.println("Sadece rakamla giris yapabilirsiniz.");
//            }
//
//            if (karar > 0 && karar < 8) {
//                switch (karar) {
//
//                    case 1:
//                        System.out.println(obj.durumlar[0] + "icin " + "Dr." + obj.doctorIsimleri[0] + " " + obj.doctorSoyIsimleri[0] + "Ünvani : " + obj.unvanlar[0]);
//                        break;
//                    case 2:
//                        System.out.println(obj.durumlar[1] + "icin " + "Dr." + obj.doctorIsimleri[1] + " " + obj.doctorSoyIsimleri[1] + "Ünvani : " + obj.unvanlar[1]);
//                        break;
//                    case 3:
//                        System.out.println(obj.durumlar[2] + "icin " + "Dr." + obj.doctorIsimleri[2] + " " + obj.doctorSoyIsimleri[2] + "Ünvani : " + obj.unvanlar[2]);
//                        break;
//                    case 4:
//                        System.out.println(obj.durumlar[3] + "icin " + "Dr." + obj.doctorIsimleri[3] + " " + obj.doctorSoyIsimleri[3] + "Ünvani : " + obj.unvanlar[3]);
//                        break;
//                    case 5:
//                        System.out.println(obj.durumlar[4] + "icin " + "Dr." + obj.doctorIsimleri[4] + " " + obj.doctorSoyIsimleri[4] + "Ünvani : " + obj.unvanlar[4]);
//                        break;
//                    case 6:
//                        System.out.println(obj.durumlar[5] + "icin " + "Dr." + obj.doctorIsimleri[5] + " " + obj.doctorSoyIsimleri[5] + "Ünvani : " + obj.unvanlar[5]);
//                        break;
//                    case 7:
//                        Randevu.slowPrint("Ana menüye yönlendirileceksiniz", 50);
//                        System.out.println();
//                        counter++;//burası
//                        break;
//                    default:
//                        System.out.println("Hatalı giris. Sayi 0 ile 7 arasinda olmalidir ");
//
//                }
//            }
//            else{
//                System.out.println("Hatali giris yaptiniz Sayi 0 ile 8 arasında olmalıdır. ");//buraya seçenekler dışında bir değer girdiniz
//
//            }
//
//        }while (counter == 0) ;
//    }
//    public static void slowPrint (String text,int delay){
//        for (char c : text.toCharArray()) {
//            System.out.print(c);
//            try {
//                Thread.sleep(delay);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//        //****buraya kadar
//
//        //** burdan aşağısı Aykut beylerin hazırladığı doktor bul ile birleştirilebilir. Bakılacak.
///*
//            System.out.println("Hasta için doktor bulmak istiyor musunuz? (E/H)");
//            String cevap = input.next();
//​
//​
//​
//            if (cevap.equalsIgnoreCase("e"))
//​
//                switch (hastalik) {
//                    case "Alerji":
//                        System.out.println("Doktorun adi : " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Allergist")]);
//                        System.out.println("Doktorun soyadi : " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Allergist")]);
//                        System.out.println("Doktorun unvani : " + hastane.unvanlar[Arrays.asList(hastane.unvanlar).indexOf("Allergist")]);
//​
//                        break;
//​
//                    case "Bas agrisi":
//​
//                        System.out.println("Doktorun adi : " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Norolog")]);
//                        System.out.println("Doktorun soyadi : " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Norolog")]);
//                        System.out.println("Doktorun unvani : " + hastane.unvanlar[Arrays.asList(hastane.unvanlar).indexOf("Norolog")]);
//​
//                        break;
//​
//                    case "Tırnak batmasi":
//​
//                        System.out.println("Doktorun adi : " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Genel Cerrah")]);
//                        System.out.println("Doktorun soyadi : " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Genel Cerrah")]);
//                        System.out.println("Doktorun unvani : " + hastane.unvanlar[Arrays.asList(hastane.unvanlar).indexOf("Genel Cerrah")]);
//​
//                        break;
//​
//                    case "Çocuk hastalıklari":
//​
//                        System.out.println("Doktorun adi : " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Cocuk Doktoru")]);
//                        System.out.println("Doktorun soyadi : " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Cocuk Doktoru")]);
//                        System.out.println("Doktorun unvani : " + hastane.unvanlar[Arrays.asList(hastane.unvanlar).indexOf("Cocuk Doktoru")]);
//​
//​
//                        break;
//​
//​
//                    case "Diyabet":
//​
//                        System.out.println("Doktorun adi : " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Dahiliye")]);
//                        System.out.println("Doktorun soyadi : " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Dahiliye")]);
//                        System.out.println("Doktorun unvani : " + hastane.unvanlar[Arrays.asList(hastane.unvanlar).indexOf("Dahiliye")]);
//​
//                        break;
//​
//                    case "Kalp hastaliklari":
//​
//                        System.out.println("Doktorun adi : " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Kardiyolog")]);
//                        System.out.println("Doktorun soyadi : " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Kardiyolog")]);
//                        System.out.println("Doktorun unvani : " + hastane.unvanlar[Arrays.asList(hastane.unvanlar).indexOf("Kardiyolog")]);
//​
//                        break;
//​
//​
//                    default:
//                        System.out.println("Hatalı giriş yaptınız");
//​
//                        break;
//                }
//            */
//
//}//Class
//
//        //
////    public Hastane(String hastaneAdi, String hastaneAdresi, String basHekim) {
////        this.hastaneAdi = hastaneAdi;
////        this.hastaneAdresi = hastaneAdresi;
////        this.basHekim = basHekim;
////    }
////
////    public Hastane() {
//
////
////    }
////
////}