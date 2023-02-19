package okulProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scan = new Scanner(System.in);
    static Map<String, String>ogretmenlerMap = new HashMap<>();
    public static void feykOgretmenEkle(){
        ogretmenlerMap.put("1234567", "Ali, Can, 1980, Matematik" );
        ogretmenlerMap.put("1234578", "Veli, San, 1981, Fizik" );
        ogretmenlerMap.put("1234589", "Ayse, Can, 1982, Kimya" );
        ogretmenlerMap.put("1234599", "Alp, Zan, 1984, Matematik" );
    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih = "";
        do {
            System.out.println("===============Yildiz Koleji===================\n" +
                    "===============Ogretmen Menu=================\n" +
                    "\n" +
                    "\t 1-Ogretmen Listesini Yazdir\n" +
                    "\t 2-Soyisminden Ogretmen Bulma\n" +
                    "\t 3-Branstan Ogretmen Bulma\n" +
                    "\t 4-Bilgileri Girerek Ogretmen Eklemek\n" +
                    "\t 5-Kimlik No ile Kayit Silme\n" +
                    "\t A-Anamenu\n" +
                    "\t Q-Cikis\n");
            tercih=scan.nextLine();

            switch (tercih){
                case "1":   //Ogretmen Listesi Yazdir
                    ogretmenListesiYazdir();
                    break;
                case "2":   //soy isimden Ogretmen bulma
                    soyisimdenOgretmenBulma();
                    break;
                case "3":
                            //Branstan Ogretmen Bulma
                    branstanOgretmenBulma();
                    break;
                case "4":
                            //Bilgileri Girerek Ogretmen Eklemek
                    ogretmenEkleme();
                    break;
                case "5":
                            //Kimlik No ile Kayit Silme
                    tcNoIleOgretmenSil();



                    break;
                case "A":
                case "a":
                    Depo.anaMenu();
                    break;
                case "Q":
                case "q":
                    break;
                default:
                    System.out.println("Lutfen gecerli tercih giriniz");
            }

        }while (!tercih.equalsIgnoreCase("q"));
        Depo.projeDurdur();
    }

    public static void tcNoIleOgretmenSil() {
        System.out.println("Silinecek ogretmen kimlik no giriniz");
        String silinecekOgretmen=scan.nextLine();

        String silinecekValue=ogretmenlerMap.get(silinecekOgretmen);

        String sonucValue = ogretmenlerMap.remove(silinecekOgretmen);

        try {
            boolean sonuc = sonucValue.equals(silinecekValue);
        }catch (Exception e){
            System.out.println("Istediginiz TC numarasi ile ogretmen bulunamadi");
        }

    }

    public static void ogretmenEkleme() {
        System.out.println("Tc no");
        String tcNo=scan.nextLine();
        System.out.println("Isim");
        String isim =scan.nextLine();
        System.out.println("Soyisim");
        String soyisim=scan.nextLine();
        System.out.println("Dogum Yili");
        String dogumYili=scan.nextLine();
        System.out.println("Brans");
        String brans=scan.nextLine();

        String eklenecekValue=isim + ", " + soyisim + ", "+ dogumYili+ ", "+ brans + ", ";
        ogretmenlerMap.put(tcNo, eklenecekValue);
    }

    public static void branstanOgretmenBulma() {
        System.out.println("Aradiginiz ogretmenin bransini  giriniz");
        String istenenSoyisim=scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();        //Map' i set'e cevirdik

        System.out.println("===============Yildiz Koleji===================\n" +
                "===============Brans isim ile ogretmen arama =================\n" +
                "TCNo   Isim Soyisim D.Yili Brans");
        for (Map.Entry<String, String> each:ogretmenEntrySet             ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuarr[]=eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuarr[3])){
                System.out.printf("%7s %-6s %-8s %4s   %s \n" , eachKey, eachValuarr[0], eachValuarr[1], eachValuarr[2], eachValuarr[3]);
            }

        }
    }

    public static void soyisimdenOgretmenBulma() {
        System.out.println("Aradiginiz ogretmenin soy ismini giriniz");
        String istenenSoyisim=scan.nextLine();

        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();        //Map' i set'e cevirdik

        System.out.println("===============Yildiz Koleji===================\n" +
                "===============Soy isim ile ogretmen arama =================\n" +
                "TCNo   Isim Soyisim D.Yili Brans");
        for (Map.Entry<String, String> each:ogretmenEntrySet             ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuarr[]=eachValue.split(", ");
            if (istenenSoyisim.equalsIgnoreCase(eachValuarr[1])){
                System.out.printf("%7s %-6s %-8s %4s   %s \n" , eachKey, eachValuarr[0], eachValuarr[1], eachValuarr[2], eachValuarr[3]);
            }

        }
    }


    public static void ogretmenListesiYazdir() throws InterruptedException {
        Set<Map.Entry<String, String>> ogretmenEntrySet = ogretmenlerMap.entrySet();        //Map' i set'e cevirdik

        System.out.println("===============Yildiz Koleji===================\n" +
                "===============Ogretmen Listesi=================\n" +
                "TCNo   Isim Soyisim D.Yili Brans");

        for (Map.Entry<String, String> each:ogretmenEntrySet             ) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();

            String eachValuarr[]=eachValue.split(", ");
            System.out.printf("%7s %-6s %-8s %4s   %s \n" , eachKey, eachValuarr[0], eachValuarr[1], eachValuarr[2], eachValuarr[3]);
        }
        Thread.sleep(2000);
    }
}
